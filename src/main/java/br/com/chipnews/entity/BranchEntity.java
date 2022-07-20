package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Getter @Setter @Data
@Entity
@Table(name = "TB_BRANCH")
public class BranchEntity implements Serializable {
    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID branchId;
    private String socialReason;
    private String fantasyName;
    private String stateRegistration;
    private String municipalRegistration;
    private String email;

    @OneToMany(mappedBy = "branch")
    private List<ServiceEntity> services;

/*    @OneToOne(cascade = { CascadeType.ALL})
    @JoinTable(name="user",
            joinColumns={@JoinColumn(name="branch_id",
                    referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="user_id",
                    referencedColumnName="id")})
    private User user;*/

    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientEntity client;
}
