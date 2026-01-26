package br.com.xmacedo.casesofdesignpatternsinspringboot.singleton.service;

import br.com.xmacedo.casesofdesignpatternsinspringboot.singleton.model.User;
import br.com.xmacedo.casesofdesignpatternsinspringboot.singleton.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
