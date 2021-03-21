package com.example.remotekitchen.remotekitchen.controller;

import com.example.remotekitchen.remotekitchen.Response.Message;
import com.example.remotekitchen.remotekitchen.models.Users.User;
import com.example.remotekitchen.remotekitchen.services.UserService.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user-management/v1")
public class UserManagementController {

    @Autowired
    UserService userService;

    Logger logger = LoggerFactory.getLogger(UserManagementController.class);


    @ApiOperation("create user account")
    @PostMapping(value = "/create-user")
    public ResponseEntity<?>createAccount( @RequestBody User user){

        return userService.AddUser(user);
    }
    @GetMapping(value = "/get_users")
    public List<User> getListofUsers(){

        return  userService.userLists();

    }





}
