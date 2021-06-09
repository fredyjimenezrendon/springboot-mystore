package com.example.springbootmystore.controllers;

import com.example.springbootmystore.model.Rol;
import com.example.springbootmystore.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    private final UserService userService;

    public DemoController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/rol")
    public ResponseEntity<List<Rol>> getAllRol() {
        return new  ResponseEntity<>(userService.getAllRol(), HttpStatus.BAD_REQUEST);
    }
}
