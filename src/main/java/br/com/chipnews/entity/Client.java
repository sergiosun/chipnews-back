package br.com.chipnews.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter @Setter @NoArgsConstructor
@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String cpfCnpj;
    private String rg;
    private Date dateBirth;
    private String nationality;
    private String phone;
    private String cellphone;

    @OneToOne(cascade = { CascadeType.DETACH})
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = {CascadeType.DETACH})
    private List<Address> address;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = {CascadeType.DETACH})
    private List<Services> services;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = {CascadeType.DETACH})
    private List<Branch> branch;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = {CascadeType.DETACH})
    private List<Signature> signature;
}
