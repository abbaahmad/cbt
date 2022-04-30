package com.fip.cbt.repositories;

import com.fip.cbt.models.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<Question, Long> {
    
}
