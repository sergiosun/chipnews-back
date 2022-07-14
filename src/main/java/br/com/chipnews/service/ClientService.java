package br.com.chipnews.service;

import br.com.chipnews.dto.CityDTO;
import br.com.chipnews.dto.ClientDTO;
import br.com.chipnews.entity.City;
import br.com.chipnews.entity.Client;
import br.com.chipnews.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.stream.DoubleStream;

@Service
public class ClientService {
    ClientRepository repository;

    ClientService(ClientRepository clientRepository) {
        this.repository = clientRepository;
    }


    public Iterable<Client> findAll() {
        return repository.findAll();
    }

    public Client save(Client client) {

        return repository.save(client);
    }

    public ClientDTO findById(Long id) {
        Client entity = repository.findById(id).get();
        ClientDTO dto = new ClientDTO(entity);
        return dto;
    }
}
