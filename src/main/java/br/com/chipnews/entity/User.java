package br.com.chipnews.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;
    private String role;

    @OneToOne(cascade = { CascadeType.DETACH})
    @JoinColumn(name = "client_id")
    private Client client;
    @OneToOne(cascade = { CascadeType.DETACH})
    @JoinColumn(name = "branch_id")
    private Branch branch;

}
