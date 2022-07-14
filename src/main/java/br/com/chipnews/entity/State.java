package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class State implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String states;
    private String initials;

    @OneToMany(mappedBy = "state", fetch = FetchType.LAZY, cascade = {CascadeType.DETACH})
    private List<City> city;
}
