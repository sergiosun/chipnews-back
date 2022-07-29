package br.com.chipnews.Controller;

import br.com.chipnews.dto.UserDTO;
import br.com.chipnews.entity.UserEntity;
import br.com.chipnews.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    UserService service;

    UserController(UserService service){
        this.service = service;
    }

/*    @GetMapping
    public Iterable<UserEntity> findAll(){
        return service.findAll();
    }

    @PostMapping
    public UserEntity create(@RequestBody UserEntity user){
        return service.save(user);
    }

    @GetMapping(value = {"/userId"})
    public UserDTO findById(@PathVariable UUID userId) {
        return service.findById(userId);
    }*/
}
