package br.com.chipnews.dto;

import br.com.chipnews.entity.State;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StateDTO {

    private Long id;
    private String states;
    private String initials;

    public StateDTO(){
    }

    public StateDTO(Long id, String states, String initials) {
        this.id = id;
        this.states = states;
        this.initials = initials;
    }
    public StateDTO(State state){

        id = state.getId();
        states = state.getStates();
        initials = state.getInitials();
    }
}
