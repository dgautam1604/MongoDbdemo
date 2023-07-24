package com.example.mongodbdemo.Repository;

import com.example.mongodbdemo.Model.jobPosts;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface postRepo extends MongoRepository<jobPosts, String> {
}
