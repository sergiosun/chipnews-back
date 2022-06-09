package br.com.chipnews.Controller;

import br.com.chipnews.entity.Branch;
import br.com.chipnews.service.BranchService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/branch"})
public class BranchController {

    BranchService service;

    BranchController(BranchService service){
        this.service = service;
    }

    @GetMapping
    public Iterable<Branch> findAll(){
        return service.findAll();
    }

    @PostMapping
    public Branch create(@RequestBody Branch branch){
        return service.save(branch);
    }
}

