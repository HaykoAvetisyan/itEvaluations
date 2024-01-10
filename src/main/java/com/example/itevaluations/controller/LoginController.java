package com.example.itevaluations.controller;

import com.example.itevaluations.dto.JwtAuthenticationResponse;
import com.example.itevaluations.dto.SignInRequest;
import com.example.itevaluations.dto.SignUpRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/auth")
@Tag(name = "auth controller", description = "authentication for users")
public interface LoginController {

    @Operation(summary = "User registration")
    @PostMapping("/sign-up")
    JwtAuthenticationResponse signUp(@RequestBody @Valid SignUpRequest request);

    @Operation(summary = "User sign-in")
    @PostMapping("/sign-in")
    JwtAuthenticationResponse signIn(@RequestBody @Valid SignInRequest request);

}
