package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Getter @Setter @Data
@Entity
@Table(name = "TB_ADDRESS")
public class AddressEntity implements Serializable {
    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID addressId;
    private String residence;
    private String district;
    private String complement;
    private Integer number;

    @OneToOne
    @JoinColumn(name = "city_id")
    private CityEntity city;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientEntity client;
}
