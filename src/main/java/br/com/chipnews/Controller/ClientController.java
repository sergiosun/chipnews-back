package br.com.chipnews.Controller;

import br.com.chipnews.dto.ClientDTO;
import br.com.chipnews.entity.ClientEntity;
import br.com.chipnews.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping({"/clients"})
public class ClientController {

    ClientService service;

    ClientController(ClientService service){
        this.service = service;
    }

    //@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
  //  @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping
    public Iterable<ClientEntity> findAll(){
        return service.findAll();
    }
    @RequestMapping(value = "clients/{id}", method = RequestMethod.GET)
    public ResponseEntity<ClientDTO> GetById(@PathVariable(value = "id") long id)
    {
        Optional<ClientDTO> client = Optional.ofNullable(service.findById(id));
        if(client.isPresent())
            return new ResponseEntity<ClientDTO>(client.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping
    public ClientEntity create(@RequestBody ClientEntity client){
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
