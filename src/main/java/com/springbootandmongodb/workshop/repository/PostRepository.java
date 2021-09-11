package com.springbootandmongodb.workshop.repository;

import com.springbootandmongodb.workshop.domain.Post;
import com.springbootandmongodb.workshop.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findByTitleContainingIgnoreCase(String text);
}
