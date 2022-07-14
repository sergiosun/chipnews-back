package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Data
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

    @OneToOne(cascade = { CascadeType.ALL})
    @JoinTable(name="user",
            joinColumns={@JoinColumn(name="branch_id",
                    referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="user_id",
                    referencedColumnName="id")})
    private User user;

    @ManyToOne(optional = true)
    @JoinColumn(name = "client_id", referencedColumnName = "id", nullable = true)
    private Client client;
}
