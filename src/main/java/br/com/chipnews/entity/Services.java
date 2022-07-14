package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Data
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
