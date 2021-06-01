package com.example.crud_operations.repositories;

import com.example.crud_operations.models.Vaccines;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VaccinesRepository extends MongoRepository<Vaccines, String> {
  Vaccines findBy_id(ObjectId _id);
}