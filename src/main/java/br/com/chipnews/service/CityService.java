package br.com.chipnews.service;

import br.com.chipnews.entity.City;
import br.com.chipnews.repository.CityRepository;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    CityRepository repository;

    CityService(CityRepository cityRepository){
        this.repository = cityRepository;
    }


    public Iterable<City> findAll() {
        return repository.findAll();
    }

    public City save(City city) {

        return repository.save(city);
    }
}
