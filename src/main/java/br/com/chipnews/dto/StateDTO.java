package br.com.chipnews.dto;

import br.com.chipnews.entity.StateEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class StateDTO {

    private UUID stateId;
    private String states;
    private String initials;

    public StateDTO(){
    }

    public StateDTO(UUID stateId, String states, String initials) {
        this.stateId = stateId;
        this.states = states;
        this.initials = initials;
    }
    public StateDTO(StateEntity state){

        stateId = state.getStateId();
        states = state.getStates();
        initials = state.getInitials();
    }
}
