package com.api.user.dto;

import lombok.*;

import java.util.Collection;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class UserDto {
    private UUID id;
    private String name;
    private String userName;
    private String password;
    private Collection<RoleDto> roles;
}
