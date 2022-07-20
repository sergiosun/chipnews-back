package br.com.chipnews.service;

import br.com.chipnews.dto.ServiceDTO;
import br.com.chipnews.entity.ServiceEntity;
import br.com.chipnews.repository.ServiceRepository;
import org.springframework.stereotype.Service;

@Service
public class ServiceService {

    ServiceRepository repository;

    ServiceService(ServiceRepository serviceRepository) {
        this.repository = serviceRepository;
    }


    public Iterable<ServiceEntity> findAll() {
        return repository.findAll();
    }

    public ServiceEntity save(ServiceEntity services) {

        return repository.save(services);

    }

    public ServiceDTO findById(Long id) {
        ServiceEntity entity = repository.findById(id).get();
        ServiceDTO dto = new ServiceDTO(entity);
        return dto;
    }
}