package ru.vladimirminka.restproject.service;

import ru.vladimirminka.restproject.entity.User;

import java.util.List;

public interface UserService {

    User create(User user);

    List<User> getAllByAgeGreaterValue(int age);

    List<User> getName(String name);

    Long findByCountAge(int age);

    User getByEmail(String email);


}
