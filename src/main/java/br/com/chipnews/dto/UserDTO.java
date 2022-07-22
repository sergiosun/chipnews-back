package br.com.chipnews.dto;

import br.com.chipnews.entity.RoleEntity;
import br.com.chipnews.entity.UserEntity;
import br.com.chipnews.enums.RoleName;
import com.sun.istack.NotNull;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
public class UserDTO {

    private UUID id;
    @NotNull
    private String username;
    @NotNull
    private String roleName;

    public UserDTO() {

    }

    public UserDTO(UUID id, String login) {
        this.id = id;
        this.username = username;
        this.roleName = roleName;
    }

    public UserDTO(UserEntity user, RoleEntity roleEntity) {
        id = user.getUserId();
        username = user.getUsername();
        roleName = roleEntity.getRoleName();
    }
}
