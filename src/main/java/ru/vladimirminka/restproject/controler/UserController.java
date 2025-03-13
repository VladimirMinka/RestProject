package ru.vladimirminka.restproject.controler;

import lombok.AllArgsConstructor;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;
import org.springframework.web.bind.annotation.*;
import ru.vladimirminka.restproject.entity.User;
import ru.vladimirminka.restproject.service.UserService;
import ru.vladimirminka.restproject.service.UserServiceIml;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
    private final UserServiceIml userServiceIml;
    private UserService userService;


    @PostMapping
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping()
    private List<User> getAge(@RequestParam int age) {
        return userService.getAllByAgeGreaterValue(age);
    }

    @GetMapping
    private List<User> getByName(@RequestParam String name) {
        return userServiceIml.getName(name);
    }

    @GetMapping
    private Long findByCountAge(@RequestParam int age) {
        return userService.findByCountAge(age);
    }

    @GetMapping
    private User getByEmail(@RequestParam String email) {
        return userServiceIml.getByEmail(email);
    }
}
