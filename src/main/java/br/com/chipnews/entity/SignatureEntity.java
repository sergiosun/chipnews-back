package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter @Setter @Data
@Entity
@Table(name = "TB_SIGNATURE")
public class SignatureEntity implements Serializable {
    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID signatureId;
    private String numAddress;
    private Date paymentDate;

    @OneToMany(mappedBy = "signature")
    private List<ContractEntity> contract;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private ServiceEntity services;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientEntity client;
}
