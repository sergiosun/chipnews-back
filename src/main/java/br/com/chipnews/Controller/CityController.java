package br.com.chipnews.Controller;

import br.com.chipnews.entity.City;
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
    public Iterable<City> findAll(){
        return service.findAll();
    }

    @PostMapping
    public City create(@RequestBody City city){
        return service.save(city);
    }
}