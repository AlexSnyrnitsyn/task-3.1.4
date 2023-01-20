package ru.itmentor.spring.boot_security.demo.service;


import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {

    void createUser(User user);

    User getUserById(Long id);

    void updateUser(Long id, User user);

    void deleteUser(Long id);

    List<User> getAllUser();

    User getUserByEmail(String email);
}
