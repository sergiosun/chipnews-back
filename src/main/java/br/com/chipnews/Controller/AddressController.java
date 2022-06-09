package br.com.chipnews.Controller;

import br.com.chipnews.entity.Address;
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
    public Iterable<Address> findAll(){
        return service.findAll();
    }

    @PostMapping
    public Address create(@RequestBody Address address){
        return service.save(address);
    }
}
