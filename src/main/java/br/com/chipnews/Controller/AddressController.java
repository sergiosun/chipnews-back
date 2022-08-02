package br.com.chipnews.Controller;

import br.com.chipnews.dto.AddressDTO;
import br.com.chipnews.entity.AddressEntity;
import br.com.chipnews.service.AddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping({"/address"})
public class AddressController {

    final AddressService service;

    AddressController(AddressService service) {
        this.service = service;
    }

    @GetMapping
    public Iterable<AddressEntity> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> saveAddress(@RequestBody @Valid AddressDTO addressDTO) {
        if (AddressService.existsByResidence(addressDTO.getResidence()) &&
                AddressService.existsByDistrict(addressDTO.getDistrict()) &&
                AddressService.existsByComplement(addressDTO.getComplement()) &&
                AddressService.existsByNumber(addressDTO.getNumber())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflito: Este endereço já foi cadastrado");
        }
        var addressEntity = new AddressEntity();
        BeanUtils.copyProperties(addressDTO, addressEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(addressEntity));
    }


    @GetMapping("/{addressId}")
    public ResponseEntity<Object> getByAddressId(@PathVariable(value = "addressId") UUID addressId) {
        Optional<AddressEntity> addressEntityOptional = AddressService.findById(addressId);
        if (!addressEntityOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Endereço não encontrado.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(addressEntityOptional.get());
    }

    @DeleteMapping("/{addressId}")
    public ResponseEntity<Object> deleteByAddressId(@PathVariable(value = "addressId") UUID addressId) {
        Optional<AddressEntity> addressEntityOptional = AddressService.findById(addressId);
        if (!addressEntityOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Endereço não encontrado.");
        }
        AddressService.delete(addressEntityOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Endereço deletado com sucesso.");
    }
    @PutMapping("/{addressId}")
    public ResponseEntity<Object> updateByAddressId(@PathVariable(value = "addressId") UUID addressId,
                                                    @RequestBody @Valid AddressDTO addressDTO) {
        Optional<AddressEntity> addressEntityOptional = AddressService.findById(addressId);
        if (!addressEntityOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Endereço não encontrado.");
        }
        var addressEntity = new AddressEntity();
        BeanUtils.copyProperties(addressDTO, addressEntity);
        addressEntity.setResidence(addressDTO.getResidence());
        addressEntity.setComplement(addressDTO.getComplement());
        addressEntity.setDistrict(addressDTO.getDistrict());
        addressEntity.setNumber(addressDTO.getNumber());
        return ResponseEntity.status(HttpStatus.OK).body(AddressService.save(addressEntity));
    }
}
