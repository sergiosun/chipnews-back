package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Getter @Setter @Data
@Entity
@Table(name = "TB_DOCUMENT")
public class DocumentEntity implements Serializable {
    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID documentId;
    private String compAddress;
    private String rgCpfFront;
    private String rgCpfBack;
    private String photoClient;
    private UUID signatureId;

}
