package br.com.chipnews.Controller;

import br.com.chipnews.entity.Services;
import br.com.chipnews.service.ServiceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/services"})
public class ServiceController {

    ServiceService service;

    ServiceController(ServiceService service){
        this.service = service;
    }

    @GetMapping
    public Iterable<Services> findAll(){
        return service.findAll();
    }

    @PostMapping
    public Services create(@RequestBody Services services){
        return service.save(services);
    }

}
