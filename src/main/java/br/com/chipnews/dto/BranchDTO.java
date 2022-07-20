package br.com.chipnews.dto;

import br.com.chipnews.entity.BranchEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class BranchDTO {

    private UUID branchId;
    private String socialReason;
    private String fantasyName;
    private String stateRegistration;
    private String municipalRegistration;
    private String email;

    public BranchDTO() {
    }

    public BranchDTO(UUID branchId, String socialReason, String fantasyName, String stateRegistration, String municipalRegistration, String email) {
        this.branchId = branchId;
        this.socialReason = socialReason;
        this.fantasyName = fantasyName;
        this.stateRegistration = stateRegistration;
        this.municipalRegistration = municipalRegistration;
        this.email = email;
    }
    public BranchDTO(BranchEntity branch){
        branchId = branch.getBranchId();
        socialReason = branch.getSocialReason();
        fantasyName = branch.getFantasyName();
        stateRegistration = branch.getStateRegistration();
        municipalRegistration = branch.getMunicipalRegistration();
        email = branch.getEmail();
    }
}
