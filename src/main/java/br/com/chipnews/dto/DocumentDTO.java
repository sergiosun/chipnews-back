package br.com.chipnews.dto;

import br.com.chipnews.entity.DocumentEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class DocumentDTO {

    private UUID documentId;
    private String compAddress;
    private String rgCpfFront;
    private String rgCpfBack;
    private String photoClient;
    private UUID signatureId;

    public DocumentDTO(){
    }

    public DocumentDTO(UUID documentId, String compAddress, String rgCpfFront, String rgCpfBack, String photoClient, UUID signatureId) {
        this.documentId = documentId;
        this.compAddress = compAddress;
        this.rgCpfFront = rgCpfFront;
        this.rgCpfBack = rgCpfBack;
        this.photoClient = photoClient;
        this.signatureId = signatureId;
    }
    public DocumentDTO(DocumentEntity document){

        documentId = document.getDocumentId();
        compAddress = document.getCompAddress();
        rgCpfFront = document.getRgCpfFront();
        rgCpfBack = document.getRgCpfBack();
        photoClient = document.getPhotoClient();
        signatureId = document.getSignatureId();
    }
}
