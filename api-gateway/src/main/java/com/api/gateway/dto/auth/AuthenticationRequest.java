package com.api.gateway.dto.auth;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class AuthenticationRequest {
    @NotEmpty
    private String userName;
    @NotEmpty
    private String password;
}
