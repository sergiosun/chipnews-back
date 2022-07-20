package br.com.chipnews.Controller;

import br.com.chipnews.entity.SignatureEntity;
import br.com.chipnews.service.SignatureService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/signatures"})
public class SignatureController {

    SignatureService service;

    SignatureController(SignatureService service){
        this.service = service;
    }

    @GetMapping
    public Iterable<SignatureEntity> findAll(){
        return service.findAll();
    }

    @PostMapping
    public SignatureEntity create(@RequestBody SignatureEntity signature){
        return service.save(signature);
    }

}
