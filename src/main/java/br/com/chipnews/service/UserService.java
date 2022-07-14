package br.com.chipnews.service;

import br.com.chipnews.dto.UserDTO;
import br.com.chipnews.entity.User;
import br.com.chipnews.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository repository;

    UserService(UserRepository userRepository){
        this.repository = userRepository;
    }


    public Iterable<User> findAll() {
        return repository.findAll();
    }

    public User save(User user) {

        return repository.save(user);
    }
    public UserDTO findById(Long id) {
        User entity = repository.findById(id).get();
        UserDTO dto = new UserDTO(entity);
        return dto;
    }
}
