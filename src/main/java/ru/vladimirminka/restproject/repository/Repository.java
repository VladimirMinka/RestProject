package ru.vladimirminka.restproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.vladimirminka.restproject.entity.User;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.age > :age")
    List<User> findByAge(@Param("age") Integer age);

    @Query("SELECT u FROM User u WHERE u.name == :name")
    List<User> findByName(@Param("name") String name);

    @Query("SELECT COUNT(u) FROM User u WHERE u.age > :age")
    Long findByCountAge(@Param("age") Integer age);

    @Query("SELECT u FROM User u WHERE u.email == :email")
    User findByEmail(@Param("email") String email);

    // добавить методы в контролеры и сервисы + принципы  REST
}
