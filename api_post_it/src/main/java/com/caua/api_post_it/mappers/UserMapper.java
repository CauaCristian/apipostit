package com.caua.api_post_it.mappers;
import com.caua.api_post_it.dto.UserDTO;
import com.caua.api_post_it.models.UserModel;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class UserMapper {
    public UserModel MapDTOToModel(UserDTO userDTO){
        UserModel usermodel = new UserModel();
        usermodel.setId(userDTO.getId());
        usermodel.setUsername(userDTO.getUsername());
        usermodel.setPassword(userDTO.getPassword());
        return usermodel;
    }
    public UserDTO MapModelToDTO(UserModel userModel){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userModel.getId());
        userDTO.setUsername(userModel.getUsername());
        userDTO.setPassword(userModel.getPassword());
        return userDTO;
    }
}
