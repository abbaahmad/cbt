package com.fip.cbt.services;

import com.fip.cbt.models.Candidate;
import com.fip.cbt.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;

    public Candidate addCandidate(){
        Candidate alice = new Candidate().setFirstName("Alice")
                .setLastName("Alex")
                .setUsername("aalex")
                .setPassword("aliceAlex123");
        return candidateRepository.save(alice);
    }
    public Candidate getCandidate(String username){
        return candidateRepository.findByUsername(username);
    }
    public List<Candidate> getAllCandidates(){
        return candidateRepository.findAll();
    }
}
