package br.com.chipnews.dto;

import br.com.chipnews.entity.Branch;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BranchDTO {

    private Long id;
    private String socialReason;
    private String fantasyName;
    private String stateRegistration;
    private String municipalRegistration;
    private String email;

    public BranchDTO() {

    }

    public BranchDTO(Long id, String socialReason, String fantasyName, String stateRegistration, String municipalRegistration, String email) {
        this.id = id;
        this.socialReason = socialReason;
        this.fantasyName = fantasyName;
        this.stateRegistration = stateRegistration;
        this.municipalRegistration = municipalRegistration;
        this.email = email;
    }
    public BranchDTO(Branch branch){
        id = branch.getId();
        socialReason = branch.getSocialReason();
        fantasyName = branch.getFantasyName();
        stateRegistration = branch.getStateRegistration();
        municipalRegistration = branch.getMunicipalRegistration();
        email = branch.getEmail();
    }
}
