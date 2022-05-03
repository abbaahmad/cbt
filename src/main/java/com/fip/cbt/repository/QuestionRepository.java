package com.fip.cbt.repository;

import com.fip.cbt.model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<Question, Long> {
    
}
