package br.com.chipnews.dto;

import br.com.chipnews.entity.Client;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class ClientDTO {

    private Long id;
    private String name;
    private String email;
    private String cpfCnpj;
    private String rg;
    private Date dateBirth;
    private String nationality;
    private String phone;
    private String cellphone;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String email, String cpfCnpj, String rg, Date dateBirth, String nationality, String phone, String cellphone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpfCnpj = cpfCnpj;
        this.rg = rg;
        this.dateBirth = dateBirth;
        this.nationality = nationality;
        this.phone = phone;
        this.cellphone = cellphone;
    }
    public ClientDTO(Client client){
        id = client.getId();
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
