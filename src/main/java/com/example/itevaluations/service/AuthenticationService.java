package com.example.itevaluations.service;

import com.example.itevaluations.dto.JwtAuthenticationResponse;
import com.example.itevaluations.dto.SignInRequest;
import com.example.itevaluations.dto.SignUpRequest;
/**
 * Service interface for authentication users.
 */
public interface AuthenticationService {
    /**
     * User registration
     *
     * @param request User info
     * @return token
     */
    JwtAuthenticationResponse signUp(SignUpRequest request);

    /**
     * Authentication of user
     *
     * @param request User info
     * @return token
     */
    JwtAuthenticationResponse signIn(SignInRequest request);
}
