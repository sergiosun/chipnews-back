package br.com.chipnews.dto;

import br.com.chipnews.entity.Contract;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContractDTO {

    private Long id;
    private Long idSignature;
    private String description;

    public ContractDTO(){
    }

    public ContractDTO(Long id, Long idSignature, String description) {
        this.id = id;
        this.idSignature = idSignature;
        this.description = description;
    }

    public ContractDTO(Contract contract){
        id = contract.getId();
        idSignature = contract.getIdSignature();
        description = contract.getDescription();
    }
}
