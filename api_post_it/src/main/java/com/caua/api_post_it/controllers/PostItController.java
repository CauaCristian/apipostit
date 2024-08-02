package com.caua.api_post_it.controllers;

import com.caua.api_post_it.services.PostItService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/postIt")
public class PostItController {
    @Autowired
    PostItService postItService;
}
