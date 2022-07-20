package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Data
@Entity
@Table(name = "TB_CLIENT")
public class ClientEntity implements Serializable {
    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID clientId;
    private String name;
    private String email;
    private String cpfCnpj;
    private String rg;
    private Date dateBirth;
    private String nationality;
    private String phone;
    private String cellphone;

/*    @OneToOne(cascade = { CascadeType.DETACH})
    @JoinColumn(name = "user_id")
    private User user;*/

    @OneToMany(mappedBy = "client")
    private List<AddressEntity> address;

    @OneToMany(mappedBy = "client")
    private List<ServiceEntity> services;

    @OneToMany(mappedBy = "client")
    private List<BranchEntity> branch;

    @OneToMany(mappedBy = "client")
    private List<SignatureEntity> signatures;
}
