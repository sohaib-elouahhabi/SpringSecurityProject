package org.security.soringsecurityproject.service;

import org.security.soringsecurityproject.model.Users;
import org.security.soringsecurityproject.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepo repo;

    @Autowired
    private JwtService jwtService;


    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    @Autowired
    AuthenticationManager authenticationManager;

    public Users saveUser(Users user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }

    public String verifLogin(Users user) {
        Authentication authUser =
               authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        if (authUser.isAuthenticated())
            return  jwtService.generateToken();

        return "fail";
    }
}
