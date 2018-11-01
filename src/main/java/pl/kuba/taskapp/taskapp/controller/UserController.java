package pl.kuba.taskapp.taskapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.kuba.taskapp.taskapp.model.User;
import pl.kuba.taskapp.taskapp.repository.UserRepository;

import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/{userId}")
    @ResponseBody

    public Optional<User> findUserById(@PathVariable("userId") Long userId) {
        return userRepository.findById(userId);
    }
}
