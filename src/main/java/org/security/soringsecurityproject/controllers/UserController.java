package org.security.soringsecurityproject.controllers;


import org.security.soringsecurityproject.model.Users;
import org.security.soringsecurityproject.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private AuthService authService;


    @PostMapping("/register")
    public Users register(@RequestBody  Users user) {
        return authService.saveUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user) {
        return authService.verifLogin(user);
    }

}
