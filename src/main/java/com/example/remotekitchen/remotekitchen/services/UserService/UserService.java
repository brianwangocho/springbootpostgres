package com.example.remotekitchen.remotekitchen.services.UserService;

import com.example.remotekitchen.remotekitchen.models.Users.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface {
    @Override
    public void AddUser(User user) {

    }

    @Override
    public List<User> userLists() {
        return null;
    }
}
