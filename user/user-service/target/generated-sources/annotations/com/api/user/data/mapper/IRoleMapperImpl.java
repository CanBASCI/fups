package com.api.user.data.mapper;

import com.api.user.data.entity.RoleEntity;
import com.api.user.dto.RoleDto;
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
public class IRoleMapperImpl implements IRoleMapper {

    @Override
    public RoleDto toDto(RoleEntity roleEntity) {
        if ( roleEntity == null ) {
            return null;
        }

        RoleDto.RoleDtoBuilder roleDto = RoleDto.builder();

        roleDto.id( roleEntity.getId() );
        roleDto.name( roleEntity.getName() );

        return roleDto.build();
    }

    @Override
    public List<RoleDto> toDtos(List<RoleEntity> roleEntityList) {
        if ( roleEntityList == null ) {
            return null;
        }

        List<RoleDto> list = new ArrayList<RoleDto>( roleEntityList.size() );
        for ( RoleEntity roleEntity : roleEntityList ) {
            list.add( toDto( roleEntity ) );
        }

        return list;
    }
}
