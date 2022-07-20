package br.com.chipnews.dto;

import br.com.chipnews.entity.ServiceEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ServiceDTO {

    private UUID serviceId;
    private String name;
    private String description;
    private Double value;

    public ServiceDTO(){
    }

    public ServiceDTO(UUID serviceId, String name, String description, Double value) {
        this.serviceId = serviceId;
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public ServiceDTO(ServiceEntity services) {
        serviceId = services.getServiceId();
        name = services.getName();
        description = services.getDescription();
        value = services.getValue();
    }
}
