package com.api.user.data;

import com.api.user.data.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IRoleRepository extends JpaRepository<RoleEntity, UUID> {
    RoleEntity findByName(String name);
}
