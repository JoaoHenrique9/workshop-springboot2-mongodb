package com.educandoweb.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.educandoweb.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
