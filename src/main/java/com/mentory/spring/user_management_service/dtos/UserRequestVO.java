package com.mentory.spring.user_management_service.dtos;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class UserRequestVO {

    String username;
    String password;
    String email;
}
