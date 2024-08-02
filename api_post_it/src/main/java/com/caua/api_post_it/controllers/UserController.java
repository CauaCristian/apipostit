package com.caua.api_post_it.controllers;
import com.caua.api_post_it.dto.UserDTO;
import com.caua.api_post_it.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping()
    public List<UserDTO> findAll(){
        return userService.findAll();
    }
}
