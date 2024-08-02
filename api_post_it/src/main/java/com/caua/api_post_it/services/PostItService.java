package com.caua.api_post_it.services;

import com.caua.api_post_it.dto.PostItDTO;
import com.caua.api_post_it.mappers.PostItMapper;
import com.caua.api_post_it.repositories.PostItRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostItService {
    @Autowired
    PostItRepository postItRepository;
    @Autowired
    PostItMapper postItMapper;
    public List<PostItDTO> findAll(){
        return null;
    }
}
