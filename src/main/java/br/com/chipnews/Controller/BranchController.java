package br.com.chipnews.Controller;

import br.com.chipnews.dto.BranchDTO;
import br.com.chipnews.entity.BranchEntity;
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
    public Iterable<BranchEntity> findAll(){
        return service.findAll();
    }

    @PostMapping
    public BranchEntity create(@RequestBody BranchEntity branch) {
        return service.save(branch);
    }

        @GetMapping(value = {"/id"})
        public BranchDTO findById(@PathVariable Long id) {
            return service.findById(id);
    }
}

