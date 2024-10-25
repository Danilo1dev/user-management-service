package com.mentory.spring.user_management_service.dtos;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class UserRequestVO {

    private String username;
    private String password;
    private String email;
}
