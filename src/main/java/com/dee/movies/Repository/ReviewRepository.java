package com.dee.movies.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dee.movies.Model.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId>{

}
