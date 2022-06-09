package br.com.chipnews.Controller;

import br.com.chipnews.entity.Client;
import br.com.chipnews.service.ClientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/clients"})
public class ClientController {

    ClientService service;

    ClientController(ClientService service){
        this.service = service;
    }

    @GetMapping
    public Iterable<Client> findAll(){
        return service.findAll();
    }

    @PostMapping
    public Client create(@RequestBody Client client){
        return service.save(client);
    }

   /* @DeleteMapping(path ={"/{id}"})
    public ResponseEntity<?> delete(@PathVariable long id) {
        return service.findById(id)
                .map(record -> {
                    service.deleteById(id);
                    ResponseEntity<Object> build = ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }*/

}
