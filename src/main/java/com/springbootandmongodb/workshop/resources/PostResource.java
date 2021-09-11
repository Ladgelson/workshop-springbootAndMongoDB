package com.springbootandmongodb.workshop.resources;

import com.springbootandmongodb.workshop.domain.Post;
import com.springbootandmongodb.workshop.domain.User;
import com.springbootandmongodb.workshop.dto.UserDTO;
import com.springbootandmongodb.workshop.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService postService;


    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        return ResponseEntity.ok(postService.findById(id));
    }
}
