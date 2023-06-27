package com.cgi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cgi.model.Question;

public interface QuestionRepository extends MongoRepository<Question,String>  {

}
