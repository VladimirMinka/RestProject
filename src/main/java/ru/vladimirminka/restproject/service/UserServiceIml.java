package ru.vladimirminka.restproject.service;

import org.springframework.stereotype.Service;
import ru.vladimirminka.restproject.repository.Repository;
import ru.vladimirminka.restproject.entity.User;

import java.util.List;

@Service
public class UserServiceIml implements UserService {
    private final Repository repository;

    public UserServiceIml(Repository repository) {
        this.repository = repository;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public List<User> getAllByAgeGreaterValue(int age) {
        return repository.findByAge(age);
    }

    @Override
    public List<User> getName(String name) {
        return repository.findByName(name);

    }

    @Override
    public Long findByCountAge(int age) {
        return repository.findByCountAge(age);
    }

    @Override
    public User getByEmail(String email) {
        return repository.findByEmail(email);
    }
}
