package br.com.chipnews.dto;

import br.com.chipnews.entity.User;
import lombok.*;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String username;
    private String role;

    public UserDTO() {

    }

    public UserDTO(Long id, String login) {
        this.id = id;
        this.username = username;
        this.role = role;
    }

    public UserDTO(User user) {
        id = user.getId();
        username = user.getUsername();
        role = user.getRole();
    }
}
