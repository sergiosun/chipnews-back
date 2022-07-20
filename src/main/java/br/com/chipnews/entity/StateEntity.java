package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;


@Getter @Setter @Data
@Entity
@Table(name = "TB_STATE")
public class StateEntity implements Serializable {
    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID stateId;
    private String states;
    private String initials;

    @OneToMany(mappedBy = "state")
    private List<CityEntity> city;
}
