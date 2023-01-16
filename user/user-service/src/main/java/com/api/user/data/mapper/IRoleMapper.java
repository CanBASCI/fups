package com.api.user.data.mapper;

import com.api.user.data.entity.RoleEntity;
import com.api.user.dto.RoleDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")
public interface IRoleMapper {
    RoleDto toDto(RoleEntity roleEntity);
    List<RoleDto> toDtos(List<RoleEntity> roleEntityList);
}
