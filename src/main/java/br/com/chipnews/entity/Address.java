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
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private String district;
    private String zipcode;

    @OneToOne(cascade = { CascadeType.DETACH})
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne(optional = true)
    @JoinColumn(name = "client_id", referencedColumnName = "id", nullable = true)
    private Client client;
}
