package com.springbootandmongodb.workshop.repository;

import com.springbootandmongodb.workshop.domain.Post;
import com.springbootandmongodb.workshop.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
