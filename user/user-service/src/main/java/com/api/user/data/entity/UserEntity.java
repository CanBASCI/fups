package com.api.user.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

@Entity
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID id;

    @Column(name="name", unique = true, nullable = false)
    private String name;

    @Column(name="user_name", unique = true, nullable = false)
    private String userName;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="roles")
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<RoleEntity> roleEntities = new ArrayList<>();
}
