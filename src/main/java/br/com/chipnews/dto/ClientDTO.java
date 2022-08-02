package br.com.chipnews.dto;

import br.com.chipnews.entity.ClientEntity;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class ClientDTO {

    private UUID clientId;
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String cpfCnpj;
    @NotBlank
    private String rg;
    @NotBlank
    private Date dateBirth;
    @NotBlank
    private String nationality;
    @NotBlank
    private String phone;
    @NotBlank
    private String cellphone;

    public ClientDTO() {
    }

    public ClientDTO(UUID clientId, String name, String email, String cpfCnpj, String rg, Date dateBirth, String nationality, String phone, String cellphone) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.cpfCnpj = cpfCnpj;
        this.rg = rg;
        this.dateBirth = dateBirth;
        this.nationality = nationality;
        this.phone = phone;
        this.cellphone = cellphone;
    }
    public ClientDTO(ClientEntity client){
        clientId = client.getClientId();
        name = client.getName();
        email = client.getEmail();
        cpfCnpj = client.getCpfCnpj();
        rg = client.getRg();
        dateBirth = client.getDateBirth();
        nationality = client.getNationality();
        phone = client.getPhone();
        cellphone = client.getCellphone();
    }
}
