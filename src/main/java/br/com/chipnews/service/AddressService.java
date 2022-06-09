package br.com.chipnews.service;

import br.com.chipnews.entity.Address;
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
    }
