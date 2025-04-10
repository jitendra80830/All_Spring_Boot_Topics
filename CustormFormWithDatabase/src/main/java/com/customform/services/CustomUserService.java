package com.customform.services;

import com.customform.model.User;
import com.customform.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomUserService {

    private UserRepository userRepository;

    public UserDetails userDetails(String usernameOrEmail){
        User user = userRepository.findByUsernameOrEmail(usernameOrEmail , usernameOrEmail).orElseThrow(
                ()-> new UsernameNotFoundException("User name or email not found in database "));

        Set<GrantedAuthority> authorities = user.getRolls().stream().map(roll -> new SimpleGrantedAuthority(roll.getName())).collect(Collectors.toSet());

        return new org.springframework.security.core.userdetails.
                User(usernameOrEmail ,
                user.getPassword() ,
                authorities);
    }
}
