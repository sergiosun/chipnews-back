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
    private String residence; //Endereço
    @NotBlank
    private String district; //Bairro
    @NotBlank
    private String complement; // Complemento
    @NotBlank
    private Integer number; // Número da residencia
    public AddressDTO() {
    }

    public AddressDTO(String address, String district, String complement, Integer number) {
        this.residence = address;
        this.district = district;
        this.complement = complement;
        this.number = number;
    }
    public AddressDTO(AddressEntity address){
        residence = address.getResidence();
        district = address.getDistrict();
        complement = address.getComplement();
        number = address.getNumber();
    }
}
