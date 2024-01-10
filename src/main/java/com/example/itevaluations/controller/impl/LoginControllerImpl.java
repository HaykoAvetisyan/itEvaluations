package com.example.itevaluations.controller.impl;

import com.example.itevaluations.controller.LoginController;
import com.example.itevaluations.dto.JwtAuthenticationResponse;
import com.example.itevaluations.dto.SignInRequest;
import com.example.itevaluations.dto.SignUpRequest;
import com.example.itevaluations.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginControllerImpl implements LoginController {
    private final AuthenticationService authenticationService;

    @Override
    public JwtAuthenticationResponse signUp(SignUpRequest request) {
        return authenticationService.signUp(request);
    }

    @Override
    public JwtAuthenticationResponse signIn(SignInRequest request) {
        return authenticationService.signIn(request);
    }
}

