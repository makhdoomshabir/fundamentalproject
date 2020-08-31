package com.qa.fundamentalproject.rest;


import com.qa.fundamentalproject.domain.Post;
import com.qa.fundamentalproject.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostsController {

    private final PostService postService;

    @Autowired
    public PostsController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public List<Post> getAllPosts(){
        return this.postService.readAllPosts();
    }
    @PostMapping("/createPost")
    public Post createPost(@RequestBody Post post){
        return this.postService.createPost(post);
    }
    @DeleteMapping("/delete/{id}")
    public Boolean deletePost(@PathVariable Long id){
        return this.postService.deletePostById(id);
    }
    @GetMapping("/getNoteById/{id}")
    public Post getPostById(@PathVariable Long id){
        return this.postService.findPostById(id);
    }

    @PutMapping("/updatePost/{id}")
    public Post updatePost(@PathVariable Long id, @RequestBody Post post){
        return this.postService.updatePost(id, post);
    }

}
