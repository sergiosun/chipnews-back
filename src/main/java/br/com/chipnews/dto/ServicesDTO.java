package br.com.chipnews.dto;

import br.com.chipnews.entity.Services;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServicesDTO {

    private Long id;
    private String name;
    private String description;
    private Double value;

    public ServicesDTO(){
    }

    public ServicesDTO(Long id, String name, String description, Double value) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public ServicesDTO(Services services) {
        id = services.getId();
        name = services.getName();
        description = services.getDescription();
        value = services.getValue();
    }
}
