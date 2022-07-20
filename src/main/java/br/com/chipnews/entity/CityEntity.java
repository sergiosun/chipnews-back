package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Getter @Setter @Data
@Entity
@Table(name = "TB_CITY")
public class CityEntity implements Serializable {
    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID cityId;
    private String urban;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private StateEntity state;

    @OneToOne(mappedBy = "city")
    private AddressEntity address;
}
