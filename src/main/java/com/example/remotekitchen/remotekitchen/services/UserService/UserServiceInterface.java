package com.example.remotekitchen.remotekitchen.services.UserService;

import com.example.remotekitchen.remotekitchen.models.Users.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserServiceInterface {

     ResponseEntity<?> AddUser(User user);

     List<User> userLists();
}
