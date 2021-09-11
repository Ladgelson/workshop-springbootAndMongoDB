package com.springbootandmongodb.workshop.services;

import com.springbootandmongodb.workshop.domain.Post;
import com.springbootandmongodb.workshop.domain.User;
import com.springbootandmongodb.workshop.repository.PostRepository;
import com.springbootandmongodb.workshop.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        Optional<Post> post = postRepository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
}
