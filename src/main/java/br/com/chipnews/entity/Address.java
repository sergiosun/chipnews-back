package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String residence;
    private String district;
    private String zipcode;

    @OneToOne(cascade = { CascadeType.DETACH})
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne(optional = true)
    @JoinColumn(name = "client_id", referencedColumnName = "id", nullable = true)
    private Client client;
}
