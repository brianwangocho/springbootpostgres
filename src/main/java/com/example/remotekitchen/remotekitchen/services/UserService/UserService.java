package com.example.remotekitchen.remotekitchen.services.UserService;

import com.example.remotekitchen.remotekitchen.Response.Message;
import com.example.remotekitchen.remotekitchen.config.ApplicationConstant;
import com.example.remotekitchen.remotekitchen.models.Users.User;
import com.example.remotekitchen.remotekitchen.repository.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService implements UserServiceInterface {
    @Autowired
    UserRepository userRepository;

    @Override
    public ResponseEntity<?> AddUser(User user) {

        user.createdOn = new Date(System.currentTimeMillis());
        user.status = ApplicationConstant.STATUS_ACTIVE;
        userRepository.save(user);
        Message message = new Message();
        message.setMessage("account created successfully");
        message.setStatus("00");

        return ResponseEntity.status(200).body(message);


    }

    @Override
    public List<User> userLists() {
        return userRepository.findAll();
    }
}
