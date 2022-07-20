package br.com.chipnews.service;

import br.com.chipnews.dto.StateDTO;
import br.com.chipnews.entity.StateEntity;
import br.com.chipnews.repository.StateRepository;
import org.springframework.stereotype.Service;

@Service
public class StateService {

    StateRepository repository;

    StateService(StateRepository stateRepository) {
        this.repository = stateRepository;
    }


    public Iterable<StateEntity> findAll() {
        return repository.findAll();
    }

    public StateEntity save(StateEntity state) {

        return repository.save(state);
    }

    /*   public DoubleStream findById(long id) {
           return null;
       }

       public void deleteById(long id) {

       }*/
    public StateDTO findById(Long id) {
        StateEntity entity = repository.findById(id).get();
        StateDTO dto = new StateDTO(entity);
        return dto;
    }
}