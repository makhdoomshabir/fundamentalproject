package com.qa.fundamentalproject.service;


import com.qa.fundamentalproject.domain.Post;
import com.qa.fundamentalproject.dto.PostDTO;
import com.qa.fundamentalproject.exception.PostNotFoundException;
import com.qa.fundamentalproject.repo.PostsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    private final PostsRepository repo;

    private final ModelMapper mapper;

    @Autowired
    public PostService(PostsRepository repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    private PostDTO mapToDTO(Post post){
        return this.mapper.map(post, PostDTO.class);
    }
    public List<PostDTO> readAllPosts(){
        return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }
    public PostDTO createPost(Post post){
        return this.mapToDTO(this.repo.save(post));
    }

    public PostDTO findPostById(Long id){
        return this.mapToDTO(this.repo.findById(id).orElseThrow(PostNotFoundException::new));
    }

    public PostDTO updatePost(Long id, Post post){
        Post update = this.repo.findById(id).orElseThrow(PostNotFoundException::new);
        update.setTitle(post.getTitle());
        update.setBody(post.getBody());
        return this.mapToDTO(this.repo.save(post));
    }
    public boolean deletePostById(Long id){
        if(!this.repo.existsById(id)){
            throw new PostNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }


}
