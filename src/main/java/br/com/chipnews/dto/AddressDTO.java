package br.com.chipnews.dto;

import br.com.chipnews.entity.AddressEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AddressDTO {

    private UUID addressId;
    private String residence;
    private String district;
    private String zipcode;

    public AddressDTO() {
    }

    public AddressDTO(UUID addressId, String address, String district, String zipcode) {
        this.addressId = addressId;
        this.residence = address;
        this.district = district;
        this.zipcode = zipcode;
    }
    public AddressDTO(AddressEntity address){
        addressId = address.getAddressId();
        residence = address.getResidence();
        district = address.getDistrict();
        zipcode = address.getZipcode();
    }
}
