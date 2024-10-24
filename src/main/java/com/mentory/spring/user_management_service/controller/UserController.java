package com.mentory.spring.user_management_service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class UserController {


    @GetMapping("/buscar")
    public ResponseEntity<String> buscaDados() {
        log.info("CONTROLLER: OK");
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
