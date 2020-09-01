package com.qa.fundamentalproject.rest;


import com.qa.fundamentalproject.domain.Blog;
import com.qa.fundamentalproject.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.acl.LastOwnerException;
import java.util.List;
import java.util.LongSummaryStatistics;

@RestController
public class BlogController {
    private final BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/getAllBlogs")
    public List<Blog> getAllBlogs(){
        return this.blogService.readAllBlogs();
    }
    @PostMapping("/createBlog")
    public Blog createBlog(@RequestBody Blog blog){
        return this.blogService.createBlog(blog);
    }
    @DeleteMapping("/deleteBlog/{id}")
    public Boolean deleteBlog(@PathVariable Long id){
        return this.blogService.deleteBlogById(id);
    }
    @GetMapping("/getBlogById/{id}")
    public Blog getBlogById(@PathVariable Long id){
        return this.blogService.findBlogById(id);
    }
    @PutMapping("/updateBlog/{id}")
    public Blog updateBlog(@PathVariable Long id, @RequestBody Blog blog){
        return this.blogService.updateBlog(id, blog);
    }


}
