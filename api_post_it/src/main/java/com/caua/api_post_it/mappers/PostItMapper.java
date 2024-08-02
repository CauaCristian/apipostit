package com.caua.api_post_it.mappers;

import com.caua.api_post_it.dto.PostItDTO;
import com.caua.api_post_it.models.PostItModel;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class PostItMapper {
    public PostItDTO mapModelToDTO(PostItModel postItModel){
        PostItDTO postItDTO = new PostItDTO();
        postItDTO.setId(postItModel.getId());
        postItDTO.setTitle(postItModel.getTitle());
        postItDTO.setDescription(postItModel.getDescription());
        postItDTO.setAutor(postItModel.getAutor().getId());
        return postItDTO;
    }
    public PostItModel mapDTOToModel(PostItDTO postItDTO){
        PostItModel postItModel = new PostItModel();
        postItModel.setId(postItDTO.getId());
        postItModel.setTitle(postItDTO.getTitle());
        postItModel.setDescription(postItDTO.getDescription());
        postItModel.setAutor(postItDTO.getAutor());
        return postItModel;
    }
}
