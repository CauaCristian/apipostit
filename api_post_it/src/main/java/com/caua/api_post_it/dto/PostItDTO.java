package com.caua.api_post_it.dto;

import com.caua.api_post_it.models.UserModel;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class PostItDTO {
    private int id;
    private String title;
    private String description;
    private Long autor;
}
