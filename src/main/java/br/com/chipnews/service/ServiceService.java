package br.com.chipnews.service;

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
}