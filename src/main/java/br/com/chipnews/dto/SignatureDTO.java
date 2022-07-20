package br.com.chipnews.dto;

import br.com.chipnews.entity.SignatureEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class SignatureDTO {

    private UUID signatureId;
    private String numAddress;
    private Date paymentDate;

    public SignatureDTO(){
    }

    public SignatureDTO(UUID signatureId, String numAddress, Date paymentDate) {
        this.signatureId = signatureId;
        this.numAddress = numAddress;
        this.paymentDate = paymentDate;
    }

    public SignatureDTO(SignatureEntity signature){

        signatureId = signature.getSignatureId();
        numAddress = signature.getNumAddress();
        paymentDate = signature.getPaymentDate();
    }
}
