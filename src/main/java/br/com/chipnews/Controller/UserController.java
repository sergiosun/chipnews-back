package br.com.chipnews.Controller;

import br.com.chipnews.entity.User;
import br.com.chipnews.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/users"})
public class UserController {

    UserService service;

    UserController(UserService service){
        this.service = service;
    }

    @GetMapping
    public Iterable<User> findAll(){
        return service.findAll();
    }

    @PostMapping
    public User create(@RequestBody User user){
        return service.save(user);
    }
}
