package br.com.chipnews.dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserDTO {
    private UUID id;
    @NotNull
    private String username;
    @NotNull
    private String roleName;
}
