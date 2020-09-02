package com.qa.fundamentalproject.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "posts"})
public class Blog {

        @Id
        @GeneratedValue
        private Long id;

        @Column
        private String name;

        @OneToMany(mappedBy = "blog", fetch = FetchType.EAGER)
        private List<Post> posts = new ArrayList<>();

        public Blog() {
        }

        public Blog(String name) {
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

        public List<Post> getPosts() {
            return posts;
        }

        public void setPosts(List<Post> posts) {
            this.posts = posts;
        }

    }

