package br.com.chipnews.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Services implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double value;

    @ManyToOne
    private Branch branch;

    @OneToMany
    private List<Signature> signature;

    @ManyToOne
    private Client client;
}
