package ru.vladimirminka.restproject.service;

import ru.vladimirminka.restproject.entity.User;

import java.util.List;

public interface UserService {

    User create(User user);

    List<User> getAllByAgeGreaterValue(int age) ;

}
