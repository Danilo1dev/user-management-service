package com.mentory.spring.user_management_service.service;

import com.mentory.spring.user_management_service.dtos.UserRequestVO;
import com.mentory.spring.user_management_service.dtos.UserValidationRequestDTO;
import com.mentory.spring.user_management_service.dtos.UserValidationResponseDTO;
import com.mentory.spring.user_management_service.mappers.UserMapper;
import com.mentory.spring.user_management_service.model.User;
import com.mentory.spring.user_management_service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public UserValidationResponseDTO validateUser(UserValidationRequestDTO userValidationRequestDTO){
        Optional<User> userOptional = userRepository.findByUserName(userValidationRequestDTO.getUsername());
        if(userOptional.isPresent()){
            User user = userOptional.get();
            return new UserValidationResponseDTO(user.getPassword().equals(userValidationRequestDTO.getPassword()));
        }
        else{
            return new UserValidationResponseDTO(false);
        }
    }

    public void createUser(UserRequestVO userRequestVO){ User user = UserMapper.INSTANCE.userRequestVOtoUser(userRequestVO); userRepository.save(user); }
}


