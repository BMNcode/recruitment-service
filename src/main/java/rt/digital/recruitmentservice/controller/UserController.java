package rt.digital.recruitmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rt.digital.recruitmentservice.domain.User;
import rt.digital.recruitmentservice.repository.UserRepo;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private final UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/users")
    List<User> findAll() {
        return userRepo.findAll();
    }
}
