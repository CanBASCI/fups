package com.api.user.data.mapper;

import com.api.user.data.entity.UserEntity;
import com.api.user.dto.UserDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-16T12:12:56+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 20-ea (Oracle Corporation)"
)
@Component
public class IUserMapperImpl implements IUserMapper {

    @Override
    public UserDto toDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDto.UserDtoBuilder userDto = UserDto.builder();

        userDto.id( userEntity.getId() );
        userDto.name( userEntity.getName() );
        userDto.userName( userEntity.getUserName() );
        userDto.password( userEntity.getPassword() );

        return userDto.build();
    }

    @Override
    public List<UserDto> toDtos(List<UserEntity> userEntityList) {
        if ( userEntityList == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( userEntityList.size() );
        for ( UserEntity userEntity : userEntityList ) {
            list.add( toDto( userEntity ) );
        }

        return list;
    }
}
