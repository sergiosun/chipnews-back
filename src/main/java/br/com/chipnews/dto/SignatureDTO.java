package br.com.chipnews.dto;

import br.com.chipnews.entity.Signature;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SignatureDTO {

    private Long id;
    private Long idClient;
    private Long idServices;
    private Long idAddress;
    private Long idBranch;
    private String numAddress;
    private Date paymentDate;

    public SignatureDTO(){
    }

    public SignatureDTO(Long id, Long idClient, Long idServices, Long idAddress, Long idBranch, String numAddress, Date paymentDate) {
        this.id = id;
        this.idClient = idClient;
        this.idServices = idServices;
        this.idAddress = idAddress;
        this.idBranch = idBranch;
        this.numAddress = numAddress;
        this.paymentDate = paymentDate;
    }

    public SignatureDTO(Signature signature){

        id = signature.getId();
        idClient = signature.getIdClient();
        idServices = signature.getIdServices();
        idAddress = signature.getIdAddress();
        idBranch = signature.getIdBranch();
        numAddress = signature.getNumAddress();
        paymentDate = signature.getPaymentDate();
    }
}
