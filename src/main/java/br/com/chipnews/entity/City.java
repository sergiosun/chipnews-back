package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class City implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;

    @ManyToOne(optional = true)
    @JoinColumn(name = "state_id", referencedColumnName = "id", nullable = true)
    private State state;
    @OneToOne(cascade = { CascadeType.DETACH})
    @JoinColumn(name = "address_id")
    private Address address;
}
