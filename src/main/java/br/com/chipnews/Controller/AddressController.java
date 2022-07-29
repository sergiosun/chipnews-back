package br.com.chipnews.Controller;

import br.com.chipnews.dto.AddressDTO;
import br.com.chipnews.entity.AddressEntity;
import br.com.chipnews.service.AddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping({"/address"})
public class AddressController {

    final AddressService service;
    AddressController(AddressService service){
        this.service = service;
    }

    @GetMapping
    public Iterable<AddressEntity> findAll(){
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> saveAddress(@RequestBody @Valid AddressDTO addressDTO){
        var addressEntity = new AddressEntity();
        BeanUtils.copyProperties(addressDTO, addressEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(addressEntity));
    }

    @GetMapping(value = {"/id"})
    public AddressDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
