package com.mongo.springbootmongodb.repository;

import com.mongo.springbootmongodb.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer>{
}
