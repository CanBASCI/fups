package com.api.user.data.mapper;

import com.api.user.data.entity.UserEntity;
import com.api.user.dto.UserDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel="spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        uses = {IRoleMapper.class})
public interface IUserMapper {
    @Mapping(target = "roles", source = "roleEntities")
    UserDto toDto(UserEntity userEntity);
    List<UserDto> toDtos(List<UserEntity> userEntityList);
}
