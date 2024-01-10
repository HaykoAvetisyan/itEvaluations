package com.example.itevaluations.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema(description = "Access token response")
public record JwtAuthenticationResponse(
        @Schema(description = "Access token", example = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTYyMjUwNj...")
        String token
) {
}
