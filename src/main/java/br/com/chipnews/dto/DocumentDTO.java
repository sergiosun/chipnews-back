package br.com.chipnews.dto;

import br.com.chipnews.entity.Document;
import lombok.Getter;
import lombok.Setter;

import javax.print.Doc;

@Getter
@Setter
public class DocumentDTO {

    private Long id;
    private String compAddress;
    private String rgCpfFront;
    private String rgCpfBack;
    private String photoClient;
    private Long idSignature;

    public DocumentDTO(){
    }

    public DocumentDTO(Long id, String compAddress, String rgCpfFront, String rgCpfBack, String photoClient, Long idSignature) {
        this.id = id;
        this.compAddress = compAddress;
        this.rgCpfFront = rgCpfFront;
        this.rgCpfBack = rgCpfBack;
        this.photoClient = photoClient;
        this.idSignature = idSignature;
    }
    public DocumentDTO(Document document){

        id = document.getId();
        compAddress = document.getCompAddress();
        rgCpfFront = document.getRgCpfFront();
        rgCpfBack = document.getRgCpfBack();
        photoClient = document.getPhotoClient();
        idSignature = document.getIdSignature();
    }
}
