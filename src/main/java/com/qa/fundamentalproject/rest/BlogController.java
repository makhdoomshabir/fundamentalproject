package com.qa.fundamentalproject.rest;



import com.qa.fundamentalproject.domain.Blog;
import com.qa.fundamentalproject.dto.BlogDTO;
import com.qa.fundamentalproject.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {
    private final BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/getAllBlogs")
    public ResponseEntity<List<BlogDTO>> getAllBlogs(){
        System.out.println(this.blogService.readAllBlogs());
        return ResponseEntity.ok(this.blogService.readAllBlogs());
    }
    @PostMapping("/createBlog")
    public ResponseEntity<BlogDTO> createBlog(@RequestBody Blog blog){
        return new ResponseEntity<BlogDTO>(this.blogService.createBlog(blog), HttpStatus.CREATED);
    }
    @DeleteMapping("/deleteBlog/{id}")
    public Boolean deleteBlog(@PathVariable Long id){
        return this.blogService.deleteBlogById(id);
    }
    @GetMapping("/getBlogById/{id}")
    public ResponseEntity<BlogDTO> getBlogById(@PathVariable Long id){
        return ResponseEntity.ok(this.blogService.findBlogById(id));
    }
    @PutMapping("/updateBlog/{id}")
    public ResponseEntity<BlogDTO> updateBlog(@PathVariable Long id, @RequestBody Blog blog){
        return ResponseEntity.ok(this.blogService.updateBlog(id, blog));
    }


}
