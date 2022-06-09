package br.com.chipnews.Controller;

import br.com.chipnews.entity.Contract;
import br.com.chipnews.service.ContractService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/contracts"})
public class ContractController {

    ContractService service;

    ContractController(ContractService service){
        this.service = service;
    }

    @GetMapping
    public Iterable<Contract> findAll(){
        return service.findAll();
    }

    @PostMapping
    public Contract create(@RequestBody Contract contract){
        return service.save(contract);
    }
}
