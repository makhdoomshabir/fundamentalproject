package com.qa.fundamentalproject.service;


import com.qa.fundamentalproject.domain.Blog;
import com.qa.fundamentalproject.dto.BlogDTO;
import com.qa.fundamentalproject.exception.BlogNotFoundException;
import com.qa.fundamentalproject.repo.BlogRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogService {

    private final BlogRepository repo;

    private final ModelMapper mapper;

    @Autowired
    public BlogService(BlogRepository repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }
    private BlogDTO mapToDTO(Blog blog){
        return this.mapper.map(blog, BlogDTO.class);
    }

    public List<BlogDTO> readAllBlogs(){
        return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public BlogDTO createBlog(Blog blog){
        return this.mapToDTO(this.repo.save(blog));
    }

    public BlogDTO findBlogById(Long id){
        return this.mapToDTO(this.repo.findById(id).orElseThrow(BlogNotFoundException::new));
    }

    public BlogDTO updateBlog(Long id, Blog blog){
        Blog update = this.repo.findById(id).orElseThrow(BlogNotFoundException::new);
        update.setName(blog.getName());
        return this.mapToDTO(this.repo.save(update));
    }

    public Boolean deleteBlogById(Long id){
        if(!this.repo.existsById(id)){
            throw new BlogNotFoundException(); //should it be PostNotFoundException?
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }

}
