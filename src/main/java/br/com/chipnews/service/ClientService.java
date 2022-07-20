package br.com.chipnews.service;

import br.com.chipnews.dto.ClientDTO;
import br.com.chipnews.entity.ClientEntity;
import br.com.chipnews.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    ClientRepository repository;

    ClientService(ClientRepository clientRepository) {
        this.repository = clientRepository;
    }


    public Iterable<ClientEntity> findAll() {
        return repository.findAll();
    }

    public ClientEntity save(ClientEntity client) {

        return repository.save(client);
    }

    public ClientDTO findById(Long id) {
        ClientEntity entity = repository.findById(id).get();
        ClientDTO dto = new ClientDTO(entity);
        return dto;
    }
}
