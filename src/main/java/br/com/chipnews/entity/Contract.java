package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Data
@Entity
public class Contract implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idSignature;
    private String description;

    @ManyToOne(optional = true)
    @JoinColumn(name = "signature_id", referencedColumnName = "id", nullable = true)
    private Signature signature;
}
