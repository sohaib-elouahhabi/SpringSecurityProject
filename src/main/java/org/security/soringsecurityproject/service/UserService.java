package org.security.soringsecurityproject.service;

import org.security.soringsecurityproject.model.UserPrincipal;
import org.security.soringsecurityproject.model.Users;
import org.security.soringsecurityproject.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService  implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = userRepo.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new UserPrincipal(user) {
        };
    }
}
