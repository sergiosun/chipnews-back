package br.com.chipnews.service;

import br.com.chipnews.dto.ContractDTO;
import br.com.chipnews.entity.ContractEntity;
import br.com.chipnews.repository.ContractRepository;
import org.springframework.stereotype.Service;

@Service
public class ContractService {

    ContractRepository repository;

    ContractService(ContractRepository contractRepository) {
        this.repository = contractRepository;
    }


    public Iterable<ContractEntity> findAll() {
        return repository.findAll();
    }

    public ContractEntity save(ContractEntity contract) {

        return repository.save(contract);
    }

    public ContractDTO findById(Long id) {
        ContractEntity entity = repository.findById(id).get();
        ContractDTO dto = new ContractDTO(entity);
        return dto;
    }
}