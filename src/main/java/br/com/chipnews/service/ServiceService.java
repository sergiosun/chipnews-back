package br.com.chipnews.service;

import br.com.chipnews.dto.ContractDTO;
import br.com.chipnews.dto.ServicesDTO;
import br.com.chipnews.entity.Contract;
import br.com.chipnews.entity.Services;
import br.com.chipnews.repository.DocumentsRepository;
import br.com.chipnews.repository.ServiceRepository;
import org.springframework.stereotype.Service;

@Service
public class ServiceService {

    ServiceRepository repository;

    ServiceService(ServiceRepository serviceRepository) {
        this.repository = serviceRepository;
    }


    public Iterable<Services> findAll() {
        return repository.findAll();
    }

    public Services save(Services services) {

        return repository.save(services);

    }

    public ServicesDTO findById(Long id) {
        Services entity = repository.findById(id).get();
        ServicesDTO dto = new ServicesDTO(entity);
        return dto;
    }
}