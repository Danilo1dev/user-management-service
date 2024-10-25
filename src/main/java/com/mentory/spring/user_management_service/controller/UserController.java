package com.mentory.spring.user_management_service.controller;

import com.mentory.spring.user_management_service.dtos.UserRequestVO;
import com.mentory.spring.user_management_service.dtos.UserValidationRequestDTO;
import com.mentory.spring.user_management_service.dtos.UserValidationResponseDTO;
import com.mentory.spring.user_management_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody UserRequestVO userRequestVO){
        userService.createUser(userRequestVO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/validate")
    public ResponseEntity<UserValidationResponseDTO> validateUser(@RequestBody UserValidationRequestDTO userValidationRequestDTO){
        return ResponseEntity.ok(userService.validateUser(userValidationRequestDTO));
    }
}
