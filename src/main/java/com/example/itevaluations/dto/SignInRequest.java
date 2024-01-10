package com.example.itevaluations.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Schema(description = "Auth request")
public record SignInRequest(
        @Schema(description = "Username", example = "Jon")
        @Size(min = 5, max = 50, message = "Length should be from 5 to 20")
        @NotBlank(message = "Can not be blank")
        String username,

        @Schema(description = "Password", example = "my_1secret1_password")
        @Size(min = 8, max = 255, message = "Length of password should be from 8 to 255 symbols")
        @NotBlank(message = "Can not be blank")
        String password
) {}
