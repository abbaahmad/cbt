package com.fip.cbt.controllers;

import com.fip.cbt.models.Candidate;
import com.fip.cbt.services.CandidateService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/candidates")
@RequiredArgsConstructor
public class CandidateController {

    @Autowired
    private final CandidateService candidateService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Candidate addCandidate(@Valid @RequestBody Candidate newCandidateRequest){
        //return candidateService.addCandidate(newCandidateRequest);
        return candidateService.addCandidate();
    }

    @GetMapping("get/all")
    public List<Candidate> getAllCandidates(){
        return candidateService.getAllCandidates();
    }
}
