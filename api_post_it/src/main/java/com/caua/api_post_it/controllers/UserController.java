package com.caua.api_post_it.controllers;
import com.caua.api_post_it.dto.UserDTO;
import com.caua.api_post_it.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public UserDTO create(@RequestBody UserDTO userDTO){
        return userService.create(userDTO);
    }
    @PostMapping("/username")
    public UserDTO findByUsername(@RequestBody UserDTO username){
        return userService.findByUsername(username);
    }
    @PutMapping
    public UserDTO update(@RequestBody UserDTO userDTO){
        return userService.update(userDTO);
    }
    @DeleteMapping
    public void delete(@RequestBody UserDTO userDTO){
        userService.delete(userDTO);
    }
}
