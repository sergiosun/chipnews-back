package br.com.chipnews.Controller;

import br.com.chipnews.entity.StateEntity;
import br.com.chipnews.service.StateService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/state"})
public class StateController {

    StateService service;

    StateController(StateService service){
        this.service = service;
    }

    @GetMapping
    public Iterable<StateEntity> findAll(){
        return service.findAll();
    }

    @PostMapping
    public StateEntity create(@RequestBody StateEntity state){
        return service.save(state);
    }

/*    @DeleteMapping(path ={"/state/{id}"})
    public ResponseEntity<State> delete(@PathVariable long id) {
        return service.findById(id)
                .map(record -> {
                    service.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }*/
}
