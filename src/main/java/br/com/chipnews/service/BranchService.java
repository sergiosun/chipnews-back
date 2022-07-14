package br.com.chipnews.service;

import br.com.chipnews.dto.BranchDTO;
import br.com.chipnews.dto.UserDTO;
import br.com.chipnews.entity.Branch;
import br.com.chipnews.entity.User;
import br.com.chipnews.repository.BranchRepository;
import org.springframework.stereotype.Service;

@Service
public class BranchService {

    BranchRepository repository;

    BranchService(BranchRepository branchRepository){
        this.repository = branchRepository;
    }


    public Iterable<Branch> findAll() {
        return repository.findAll();
    }

    public Branch save(Branch branch) {

        return repository.save(branch);
    }
    public BranchDTO findById(Long id) {
        Branch entity = repository.findById(id).get();
        BranchDTO dto = new BranchDTO(entity);
        return dto;
    }
}
