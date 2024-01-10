package com.example.itevaluations.service;

import com.example.itevaluations.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Service interface for managing users.
 */
public interface UserService {

    /**
     * Save a user.
     *
     * @param user the user to save
     */
    void save(User user);

    /**
     * Create a user.
     *
     * @param user the user to create
     * @throws RuntimeException if a user with the same username or email already exists
     */
    void create(User user);

    /**
     * Get a user by their username.
     *
     * @param username the username of the user
     * @return the found user
     * @throws UsernameNotFoundException if the user is not found
     */
    User getByUsername(String username) throws UsernameNotFoundException;

    /**
     * Get the currently authenticated user.
     *
     * @return the current user
     */
    User getCurrentUser();

    /**
     * Get the userDetails.
     *
     */
    UserDetailsService userDetailsService();

}
