package com.springbootandmongodb.workshop.resources;

import com.springbootandmongodb.workshop.domain.User;
import com.springbootandmongodb.workshop.dto.UserDTO;
import com.springbootandmongodb.workshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> findAll() {
        return  userService.findAll()
                .stream()
                .map(user -> new UserDTO(user))
                .collect(Collectors.toList());
    }
}
