package br.com.chipnews.service;

import br.com.chipnews.dto.AddressDTO;
import br.com.chipnews.dto.UserDTO;
import br.com.chipnews.entity.Address;
import br.com.chipnews.entity.User;
import br.com.chipnews.repository.AddressRepository;
import br.com.chipnews.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    AddressRepository repository;

    AddressService(AddressRepository addressRepository){
        this.repository = addressRepository;
    }


    public Iterable<Address> findAll() {
        return repository.findAll();
    }

    public Address save(Address address) {

            return repository.save(address);
        }
    public AddressDTO findById(Long id) {
        Address entity = repository.findById(id).get();
        AddressDTO dto = new AddressDTO(entity);
        return dto;
    }
    }
