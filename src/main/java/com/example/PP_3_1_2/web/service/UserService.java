package com.example.PP_3_1_2.web.service;


import com.example.PP_3_1_2.web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    User getUser(int id);

    void updateUser(User user);

    void removeUser(int id);
}
