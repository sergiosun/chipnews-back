package br.com.chipnews.service;

import br.com.chipnews.dto.AddressDTO;
import br.com.chipnews.entity.AddressEntity;
import br.com.chipnews.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    AddressRepository repository;

    AddressService(AddressRepository addressRepository){
        this.repository = addressRepository;
    }


    public Iterable<AddressEntity> findAll() {
        return repository.findAll();
    }

    public AddressEntity save(AddressEntity address) {

            return repository.save(address);
        }
    public AddressDTO findById(Long id) {
        AddressEntity entity = repository.findById(id).get();
        AddressDTO dto = new AddressDTO(entity);
        return dto;
    }
    }
