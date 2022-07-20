package br.com.chipnews.dto;

import br.com.chipnews.entity.UserEntity;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
public class UserDTO {

    private UUID id;
    private String username;

    public UserDTO() {

    }

    public UserDTO(UUID id, String login) {
        this.id = id;
        this.username = username;
    }

    public UserDTO(UserEntity user) {
        id = user.getUserId();
        username = user.getUsername();
    }
}
