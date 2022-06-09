package br.com.chipnews.service;

import br.com.chipnews.entity.Branch;
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
}
