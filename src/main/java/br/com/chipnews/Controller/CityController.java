package br.com.chipnews.Controller;

import br.com.chipnews.dto.CityDTO;
import br.com.chipnews.entity.CityEntity;
import br.com.chipnews.service.CityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/city"})
public class CityController {

    CityService service;

    CityController(CityService service){
        this.service = service;
    }

    @GetMapping
    public Iterable<CityEntity> findAll(){
        return service.findAll();
    }

    @PostMapping
    public CityEntity create(@RequestBody CityEntity city){
        return service.save(city);
    }
    @GetMapping(value = {"/id"})
    public CityDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }
}