package br.com.chipnews.dto;

import br.com.chipnews.entity.City;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityDTO {

    private Long id;
    private String urban;

    public CityDTO() {
    }

    public CityDTO(Long id, String city) {
        this.id = id;
        this.urban = urban;
    }

    public CityDTO(City city){
        id = city.getId();
        urban = city.getUrban();
    }
}
