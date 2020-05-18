package com.tosh.springbootmongodb.repository;


import com.tosh.springbootmongodb.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
