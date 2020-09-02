package com.qa.fundamentalproject.rest;


import com.qa.fundamentalproject.domain.Post;
import com.qa.fundamentalproject.dto.PostDTO;
import com.qa.fundamentalproject.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<PostDTO>> getAllPosts(){
        return ResponseEntity.ok(this.postService.readAllPosts());
    }

    @PostMapping("/createPost")
    public ResponseEntity<PostDTO> createPost(@RequestBody Post post){
        return new ResponseEntity<PostDTO>(this.postService.createPost(post), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePost(@PathVariable Long id){
        return this.postService.deletePostById(id)
                ? ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
                : ResponseEntity.noContent().build();
    }

    @GetMapping("/getNoteById/{id}")
    public ResponseEntity<PostDTO> getPostById(@PathVariable Long id){
        return ResponseEntity.ok(this.postService.findPostById(id));
    }

    @PutMapping("/updatePost/{id}")
    public ResponseEntity<PostDTO> updatePost(@PathVariable Long id, @RequestBody Post post){
        return ResponseEntity.ok(this.postService.updatePost(id, post));
    }

}
