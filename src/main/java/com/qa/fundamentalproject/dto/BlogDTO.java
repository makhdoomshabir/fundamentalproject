package com.qa.fundamentalproject.dto;

import com.qa.fundamentalproject.domain.Post;

import java.util.ArrayList;
import java.util.List;

public class BlogDTO {

    private Long id;
    private String name;
    private List<PostDTO> posts = new ArrayList<>();

    public BlogDTO() {
    }

    public BlogDTO(String name) {
        super();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PostDTO> getPosts() {
        return posts;
    }

    public void setPosts(List<PostDTO> posts) {
        this.posts = posts;
    }

}
