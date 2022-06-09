package br.com.chipnews.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Branch implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String socialReason;
    private String fantasyName;
    private String stateRegistration;
    private String municipalRegistration;
    private String email;

    @OneToMany
    private List<Services> services;

    @OneToOne
    private User user;

    @ManyToOne
    private Client client;
}
