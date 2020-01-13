package com.udacity.course3.reviews.repository;

import com.udacity.course3.reviews.entity.mongo.ReviewMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ReviewMongoRepository extends MongoRepository<ReviewMongo, Integer> {

}