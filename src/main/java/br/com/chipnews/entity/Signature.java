package br.com.chipnews.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Signature implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idClient;
    private Long idServices;
    private Long idAddress;
    private Long idBranch;
    private String numAddress;
    private Date paymentDate;

    @OneToMany
    private List<Contract> contract;

    @ManyToOne
    private Services services;

    @ManyToOne
    private Client client;
}
