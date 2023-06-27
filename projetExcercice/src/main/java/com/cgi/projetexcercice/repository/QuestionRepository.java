package com.cgi.projetexcercice.repository;

import com.cgi.projetexcercice.collection.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends MongoRepository<Question,String> {
}
