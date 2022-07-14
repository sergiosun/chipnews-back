package br.com.chipnews.service;

import br.com.chipnews.dto.ContractDTO;
import br.com.chipnews.dto.StateDTO;
import br.com.chipnews.entity.Contract;
import br.com.chipnews.entity.State;
import br.com.chipnews.repository.StateRepository;
import org.springframework.stereotype.Service;

import java.util.stream.DoubleStream;

@Service
public class StateService {

    StateRepository repository;

    StateService(StateRepository stateRepository) {
        this.repository = stateRepository;
    }


    public Iterable<State> findAll() {
        return repository.findAll();
    }

    public State save(State state) {

        return repository.save(state);
    }

    /*   public DoubleStream findById(long id) {
           return null;
       }

       public void deleteById(long id) {

       }*/
    public StateDTO findById(Long id) {
        State entity = repository.findById(id).get();
        StateDTO dto = new StateDTO(entity);
        return dto;
    }
}