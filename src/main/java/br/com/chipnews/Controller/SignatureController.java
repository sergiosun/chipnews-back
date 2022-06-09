package br.com.chipnews.Controller;

import br.com.chipnews.entity.Services;
import br.com.chipnews.entity.Signature;
import br.com.chipnews.service.ServiceService;
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
    public Iterable<Signature> findAll(){
        return service.findAll();
    }

    @PostMapping
    public Signature create(@RequestBody Signature signature){
        return service.save(signature);
    }

}
