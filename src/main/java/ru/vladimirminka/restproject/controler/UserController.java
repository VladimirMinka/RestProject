package ru.vladimirminka.restproject.controler;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.vladimirminka.restproject.entity.User;
import ru.vladimirminka.restproject.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
   private UserService userService;


    @PostMapping
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping()
    private List<User> getAge(@RequestParam int age) {
        return userService.getAllByAgeGreaterValue(age);
    }
}
