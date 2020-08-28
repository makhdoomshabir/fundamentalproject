package com.qa.fundamentalproject.service;


import com.qa.fundamentalproject.domain.Post;
import com.qa.fundamentalproject.exception.PostNotFoundException;
import com.qa.fundamentalproject.repo.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostsRepository repo;

    @Autowired
    public PostService(PostsRepository repo) {
        this.repo = repo;
    }

    public List<Post> readAllPosts(){
        return this.repo.findAll();
    }

    public Post createPost(Post post){
        return this.repo.save(post);
    }

    public Post findPostById(Long id){
        return this.repo.findById(id).orElseThrow(PostNotFoundException::new);
    }

    public Post updatePost(Long id, Post post){
        Post update = findPostById(id);
        update.setTitle(post.getTitle());
        update.setBody(post.getBody());
        return this.repo.save(update);
    }
    public boolean deletePostById(Long id){
        if(!this.repo.existsById(id)){
            throw new PostNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }


}
