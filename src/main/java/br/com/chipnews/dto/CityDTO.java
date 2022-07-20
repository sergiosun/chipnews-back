package br.com.chipnews.dto;

import br.com.chipnews.entity.CityEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CityDTO {

    private UUID cityId;
    private String urban;

    public CityDTO() {
    }

    public CityDTO(UUID cityId, String city) {
        this.cityId = cityId;
        this.urban = urban;
    }

    public CityDTO(CityEntity city){
        cityId = city.getCityId();
        urban = city.getUrban();
    }
}
