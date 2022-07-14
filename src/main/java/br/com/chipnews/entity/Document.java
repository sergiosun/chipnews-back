package br.com.chipnews.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Data
@Entity
public class Document implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String compAddress;
    private String rgCpfFront;
    private String rgCpfBack;
    private String photoClient;
    private Long idSignature;

}
