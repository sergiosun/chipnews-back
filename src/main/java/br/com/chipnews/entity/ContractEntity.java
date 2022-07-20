package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Getter @Setter @Data
@Entity
@Table(name = "TB_CONTRACT")
public class ContractEntity implements Serializable {
    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID contractId;
    private Long idSignature;
    private String description;

    @ManyToOne(optional = true)
    @JoinColumn(name = "signature_id")
    private SignatureEntity signature;
}
