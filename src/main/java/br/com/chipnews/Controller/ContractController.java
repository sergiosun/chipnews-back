package br.com.chipnews.Controller;

import br.com.chipnews.dto.ContractDTO;
import br.com.chipnews.entity.ContractEntity;
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
    public Iterable<ContractEntity> findAll(){
        return service.findAll();
    }

    @PostMapping
    public ContractEntity create(@RequestBody ContractEntity contract){
        return service.save(contract);
    }
    @GetMapping(value = {"/id"})
    public ContractDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
