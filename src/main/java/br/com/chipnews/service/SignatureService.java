package br.com.chipnews.service;

import br.com.chipnews.dto.SignatureDTO;
import br.com.chipnews.entity.SignatureEntity;
import br.com.chipnews.repository.SignatureRepository;
import org.springframework.stereotype.Service;

@Service
public class SignatureService {

    SignatureRepository repository;

    SignatureService(SignatureRepository signatureRepository) {
        this.repository = signatureRepository;
    }


    public Iterable<SignatureEntity> findAll() {
        return repository.findAll();
    }

    public SignatureEntity save(SignatureEntity signature) {

        return repository.save(signature);

    }
        public SignatureDTO findById (Long id){
            SignatureEntity entity = repository.findById(id).get();
            SignatureDTO dto = new SignatureDTO(entity);
            return dto;
    }
}
