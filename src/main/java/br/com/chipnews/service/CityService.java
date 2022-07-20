package br.com.chipnews.service;

import br.com.chipnews.dto.CityDTO;
import br.com.chipnews.entity.CityEntity;
import br.com.chipnews.repository.CityRepository;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    CityRepository repository;

    CityService(CityRepository cityRepository){
        this.repository = cityRepository;
    }


    public Iterable<CityEntity> findAll() {
        return repository.findAll();
    }

    public CityEntity save(CityEntity city) {

        return repository.save(city);
    }
    public CityDTO findById(Long id) {
        CityEntity entity = repository.findById(id).get();
        CityDTO dto = new CityDTO(entity);
        return dto;
    }
}
