package com.example.remotekitchen.remotekitchen.services.UserService;

import com.example.remotekitchen.remotekitchen.models.Users.User;

import java.util.List;

public interface UserServiceInterface {

     void AddUser(User user);

     List<User> userLists();
}
