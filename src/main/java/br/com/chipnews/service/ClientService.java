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
        throw

        if(){
            return repository.save(client);
        }else{
            return repository.save(client);
        }

    }

/*    public DoubleStream findById(long id) {
        return findById(id);
    }*/

/*    public void deleteById(long id) {
    }*/
}
