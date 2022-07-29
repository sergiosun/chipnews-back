package br.com.chipnews.service;

import br.com.chipnews.entity.UserEntity;
import br.com.chipnews.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository repository;

    UserService(UserRepository userRepository){
        this.repository = userRepository;
    }

//
//    public Iterable<UserDTO> findAll() {
//        return repository.findAll();
//    }


    public UserEntity save(UserEntity user) {

        return repository.save(user);
    }
/*    public UserDTO findById(UUID userId) {
        UserEntity entity = repository.findById(userId).get();
        UserDTO dto = new UserDTO(entity);
        return dto;
    }*/
}
