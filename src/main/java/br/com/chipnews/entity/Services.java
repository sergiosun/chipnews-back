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

    @ManyToOne(optional = true)
    @JoinColumn(name = "branch_id", referencedColumnName = "id", nullable = true)
    private Branch branch;

    @OneToMany(mappedBy = "services", fetch = FetchType.LAZY, cascade = {CascadeType.DETACH})
    private List<Signature> signature;

    @ManyToOne(optional = true)
    @JoinColumn(name = "client_id", referencedColumnName = "id", nullable = true)
    private Client client;
}
