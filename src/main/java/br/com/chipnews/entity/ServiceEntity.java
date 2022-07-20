package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Getter @Setter @Data
@Entity
@Table(name = "TB_SERVICE")
public class ServiceEntity implements Serializable {
    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID serviceId;
    private String name;
    private String description;
    private Double value;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private BranchEntity branch;

    @OneToMany(mappedBy = "services")
    private List<SignatureEntity> signature;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientEntity client;
}
