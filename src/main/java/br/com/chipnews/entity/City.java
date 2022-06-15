package br.com.chipnews.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
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
