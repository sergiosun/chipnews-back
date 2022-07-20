package br.com.chipnews.Controller;

import br.com.chipnews.dto.AddressDTO;
import br.com.chipnews.entity.AddressEntity;
import br.com.chipnews.service.AddressService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/address"})
public class AddressController {

    AddressService service;

    AddressController(AddressService service){
        this.service = service;
    }

    @GetMapping
    public Iterable<AddressEntity> findAll(){
        return service.findAll();
    }

    @PostMapping
    public AddressEntity create(@RequestBody AddressEntity address){
        return service.save(address);
    }
    @GetMapping(value = {"/id"})
    public AddressDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
