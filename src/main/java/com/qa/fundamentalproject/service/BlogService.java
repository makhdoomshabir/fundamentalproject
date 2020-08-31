package com.qa.fundamentalproject.service;


import com.qa.fundamentalproject.domain.Blog;
import com.qa.fundamentalproject.exception.BlogNotFoundException;
import com.qa.fundamentalproject.repo.BlogRepository;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    private final BlogRepository repo;

    @Autowired
    public BlogService(BlogRepository repo) {
        this.repo = repo;
    }
    public List<Blog> readAllBlogs(){
        return this.repo.findAll();
    }

    public Blog createBlog(Blog blog){
        return this.repo.save(blog);
    }

    public Blog findBlogById(Long id){
        return this.repo.findById(id).orElseThrow(BlogNotFoundException::new);
    }

    public Blog updateBlog(Long id, Blog blog){
        Blog update = findBlogById(id);
        update.setName(blog.getName());
        return this.repo.save(update);
    }

    public Boolean deleteBlogById(Long id){
        if(!this.repo.existsById(id)){
            throw new BlogNotFoundException(); //should it be PostNotFoundException?
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }

}
