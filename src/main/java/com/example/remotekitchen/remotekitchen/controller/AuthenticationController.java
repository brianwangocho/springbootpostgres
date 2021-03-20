package com.example.remotekitchen.remotekitchen.controller;


import com.example.remotekitchen.remotekitchen.Request.AuthRequest;
import com.example.remotekitchen.remotekitchen.Response.Message;
import com.example.remotekitchen.remotekitchen.Response.Token;
import com.example.remotekitchen.remotekitchen.exceptions.LoginException;
import com.example.remotekitchen.remotekitchen.models.Users.User;
import com.example.remotekitchen.remotekitchen.repository.UserRepository.UserRepository;
import com.example.remotekitchen.remotekitchen.util.JwtUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;




@Api( tags = "userlogin")
@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationManager authenticationManager;


    @PostMapping("/authenticate")
    public ResponseEntity<?> generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        Token token = new Token();
        Message message = new Message();


        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword())
            );
        } catch (Exception e) {
            throw e;
        }


        User user = userRepository.findByEmail(authRequest.getEmail());
        /////request after login
        message.setStatus("00");
        message.setMessage("Login was successful");
        Date expiration = jwtUtil.extractExpiration(jwtUtil.generateToken(authRequest.getEmail()));
        token.setExpiration(expiration);
        token.setEmail(user.email);
        token.setUserName(user.firstName+user.lastName);

        token.setPhone(user.telephone);
        token.setId(user.getId());
        token.setMessage(message);
        token.setToken(jwtUtil.generateToken(authRequest.getEmail()));

        return ResponseEntity.status(200).body(token);


    }
}
