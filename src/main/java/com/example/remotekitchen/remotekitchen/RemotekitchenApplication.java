package com.example.remotekitchen.remotekitchen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication

public class RemotekitchenApplication {


    public static void main(String[] args)
    {
        SpringApplication.run(RemotekitchenApplication.class, args

        );
BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("W@ngocho123"));


    }

}
