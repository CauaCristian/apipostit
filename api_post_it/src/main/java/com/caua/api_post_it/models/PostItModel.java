package com.caua.api_post_it.models;

import jakarta.persistence.*;

@Entity
@Table
public class PostItModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @ManyToOne
    private UserModel autor;
}
