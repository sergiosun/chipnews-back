package br.com.chipnews.dto;

import br.com.chipnews.entity.AddressEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Getter @Setter
@Data
public class AddressDTO {
    private UUID addressId;
    @NotBlank
    private String residence;
    @NotBlank
    private String district;
    @NotBlank
    private String zipcode;

    public AddressDTO() {
    }

    public AddressDTO(String address, String district, String zipcode) {
        this.residence = address;
        this.district = district;
        this.zipcode = zipcode;
    }
    public AddressDTO(AddressEntity address){
        residence = address.getResidence();
        district = address.getDistrict();
        zipcode = address.getZipcode();
    }
}
