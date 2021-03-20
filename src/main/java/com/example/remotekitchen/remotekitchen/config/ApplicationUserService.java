package com.example.remotekitchen.remotekitchen.config;

import com.example.remotekitchen.remotekitchen.models.Users.User;
import com.example.remotekitchen.remotekitchen.repository.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ApplicationUserService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user =  userRepository.findByEmail(email);
        return new org.springframework.security.core.userdetails.User(user.email,user.password,new ArrayList<>());
    }
}
