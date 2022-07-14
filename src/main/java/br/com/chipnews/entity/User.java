package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role;

    @OneToOne(cascade = { CascadeType.DETACH})
    @JoinColumn(name = "client_id")
    private Client client;
    @OneToOne(cascade = { CascadeType.DETACH})
    @JoinColumn(name = "branch_id")
    private Branch branch;

}
