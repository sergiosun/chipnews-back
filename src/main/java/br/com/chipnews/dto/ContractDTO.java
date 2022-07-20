package br.com.chipnews.dto;

import br.com.chipnews.entity.ContractEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ContractDTO {

    private UUID contractId;
    private UUID signatureId;
    private String description;

    public ContractDTO(){
    }

    public ContractDTO(UUID contractId, UUID signatureId, String description) {
        this.contractId = contractId;
        this.signatureId = signatureId;
        this.description = description;
    }

    public ContractDTO(ContractEntity contract){
        contractId = contract.getContractId();
        signatureId = contract.getContractId();
        description = contract.getDescription();
    }
}
