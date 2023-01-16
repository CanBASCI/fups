package com.api.user.dto;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class RoleDto {
    private UUID id;
    private String name;
}
