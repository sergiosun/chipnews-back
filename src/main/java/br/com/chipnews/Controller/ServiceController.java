package br.com.chipnews.Controller;

import br.com.chipnews.entity.ServiceEntity;
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
    public Iterable<ServiceEntity> findAll(){
        return service.findAll();
    }

    @PostMapping
    public ServiceEntity create(@RequestBody ServiceEntity services){
        return service.save(services);
    }

}
