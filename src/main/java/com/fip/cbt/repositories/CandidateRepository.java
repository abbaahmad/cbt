package com.fip.cbt.repositories;

import com.fip.cbt.models.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CandidateRepository extends MongoRepository<Candidate, String> {

    @Query("{Candidate:'?0'}")
    Candidate findByUsername(String username);

    //@Query("")
    //List<Candidate> findByRole(String rolename);
}
