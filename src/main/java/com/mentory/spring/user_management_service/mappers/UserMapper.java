package com.mentory.spring.user_management_service.mappers;

import com.mentory.spring.user_management_service.dtos.UserRequestVO;
import com.mentory.spring.user_management_service.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );
    User userRequestVOtoUser(UserRequestVO userRequestVO);
}
