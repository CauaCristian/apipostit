package com.caua.api_post_it.services;

import com.caua.api_post_it.dto.UserDTO;
import com.caua.api_post_it.mappers.UserMapper;
import com.caua.api_post_it.models.UserModel;
import com.caua.api_post_it.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserMapper userMapper;
    public List<UserDTO> findAll(){
        List<UserModel> listUserModel = userRepository.findAll();
        List<UserDTO> listUserDTO = new ArrayList<>();
        for (int i = 0; i < listUserModel.size(); i++) {
            listUserDTO.add(userMapper.MapModelToDTO(listUserModel.get(i)));
        }
        return listUserDTO;
    }
}
