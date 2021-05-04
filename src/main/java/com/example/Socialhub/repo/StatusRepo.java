package com.example.Socialhub.repo;

import com.example.Socialhub.entity.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepo extends MongoRepository<Status, Integer> {
}
