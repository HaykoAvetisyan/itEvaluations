package com.example.itevaluations.service.impl;

import com.example.itevaluations.exception.UserNotFoundException;
import com.example.itevaluations.model.User;
import com.example.itevaluations.repository.UserRepository;
import com.example.itevaluations.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public void save(User user) {
        repository.save(user);
    }


    @Override
    public void create(User user) {
        if (repository.existsByUsername(user.getUsername())) {
            throw new UserNotFoundException("User already exist");
        }
        save(user);
    }

    @Override
    public User getByUsername(String username) {
        return repository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

    }

    @Override
    public UserDetailsService userDetailsService() {
        return this::getByUsername;
    }

    @Override
    public User getCurrentUser() {
        var username = SecurityContextHolder.getContext().getAuthentication().getName();
        return getByUsername(username);
    }
}
