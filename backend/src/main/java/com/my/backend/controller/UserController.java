package com.my.backend.controller;

import com.my.backend.dto.CreateUserRequest;
import com.my.backend.entity.User;
import com.my.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping
    public List<User> list() {
        return service.findAll();
    }

    @PostMapping
    public User create(@RequestBody CreateUserRequest request) {
        return service.create(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}