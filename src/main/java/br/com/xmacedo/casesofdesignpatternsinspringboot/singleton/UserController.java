package br.com.xmacedo.casesofdesignpatternsinspringboot.singleton;

import br.com.xmacedo.casesofdesignpatternsinspringboot.singleton.model.User;
import br.com.xmacedo.casesofdesignpatternsinspringboot.singleton.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    public  UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.findById(id);
    }
}
