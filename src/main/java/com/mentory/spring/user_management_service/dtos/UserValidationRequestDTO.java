package com.mentory.spring.user_management_service.dtos;

import lombok.Value;

@Value
public class UserValidationRequestDTO {

    String username;
    String password;
}
