package br.com.chipnews.service;

import br.com.chipnews.dto.BranchDTO;
import br.com.chipnews.entity.BranchEntity;
import br.com.chipnews.repository.BranchRepository;
import org.springframework.stereotype.Service;

@Service
public class BranchService {

    BranchRepository repository;

    BranchService(BranchRepository branchRepository){
        this.repository = branchRepository;
    }


    public Iterable<BranchEntity> findAll() {
        return repository.findAll();
    }

    public BranchEntity save(BranchEntity branch) {

        return repository.save(branch);
    }
    public BranchDTO findById(Long id) {
        BranchEntity entity = repository.findById(id).get();
        BranchDTO dto = new BranchDTO(entity);
        return dto;
    }
}
