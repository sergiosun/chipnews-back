package br.com.chipnews.service;

import br.com.chipnews.entity.Client;
import br.com.chipnews.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.stream.DoubleStream;

@Service
public class ClientService {
    ClientRepository repository;

    ClientService(ClientRepository clientRepository){
        this.repository = clientRepository;
    }


    public Iterable<Client> findAll() {
        return repository.findAll();
    }

    public Client save(Client client) {

        return repository.save(client);
    }


}
