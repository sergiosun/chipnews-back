package br.com.chipnews.dto;

import br.com.chipnews.entity.Address;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {

    private Long id;
    private String residence;
    private String district;
    private String zipcode;

    public AddressDTO() {

    }

    public AddressDTO(Long id, String address, String district, String zipcode) {
        this.id = id;
        this.residence = address;
        this.district = district;
        this.zipcode = zipcode;
    }
    public AddressDTO(Address address){
        id = address.getId();
        residence = address.getResidence();

    }
}
