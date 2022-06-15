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

    @OneToMany(mappedBy = "branch", fetch = FetchType.LAZY, cascade = {CascadeType.DETACH})
    private List<Services> services;

    @OneToOne(cascade = { CascadeType.DETACH})
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(optional = true)
    @JoinColumn(name = "client_id", referencedColumnName = "id", nullable = true)
    private Client client;
}
