package br.com.chipnews.service;

import br.com.chipnews.dto.CityDTO;
import br.com.chipnews.dto.ContractDTO;
import br.com.chipnews.entity.City;
import br.com.chipnews.entity.Contract;
import br.com.chipnews.repository.ContractRepository;
import org.springframework.stereotype.Service;

@Service
public class ContractService {

    ContractRepository repository;

    ContractService(ContractRepository contractRepository) {
        this.repository = contractRepository;
    }


    public Iterable<Contract> findAll() {
        return repository.findAll();
    }

    public Contract save(Contract contract) {

        return repository.save(contract);
    }

    public ContractDTO findById(Long id) {
        Contract entity = repository.findById(id).get();
        ContractDTO dto = new ContractDTO(entity);
        return dto;
    }
}