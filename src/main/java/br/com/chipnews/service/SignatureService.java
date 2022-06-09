package br.com.chipnews.service;

import br.com.chipnews.entity.Services;
import br.com.chipnews.entity.Signature;
import br.com.chipnews.repository.ServiceRepository;
import br.com.chipnews.repository.SignatureRepository;
import org.springframework.stereotype.Service;

@Service
public class SignatureService {

    SignatureRepository repository;

    SignatureService(SignatureRepository signatureRepository) {
        this.repository = signatureRepository;
    }


    public Iterable<Signature> findAll() {
        return repository.findAll();
    }

    public Signature save(Signature signature) {

        return repository.save(signature);

    }
}
