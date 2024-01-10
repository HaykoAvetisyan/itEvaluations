package com.example.itevaluations.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "Register request")
public record SignUpRequest(

        @Schema(description = "Username", example = "Jon")
        @Size(min = 5, max = 50, message = "Username length should be 5-50 symbols")
        @NotBlank(message = "Username can not be blank")
        String username,

        @Schema(description = "Email address", example = "jondoe@gmail.com")
        @Size(min = 5, max = 255, message = "Адрес электронной почты должен содержать от 5 до 255 символов")
        @NotBlank(message = "Адрес электронной почты не может быть пустыми")
        @Email(message = "Email must follow this format user@example.com")
        String email,

        @Schema(description = "password", example = "my_1secret1_password")
        @Size(max = 255, message = "length should be not exceed 255 symbols")
        String password) {


}
