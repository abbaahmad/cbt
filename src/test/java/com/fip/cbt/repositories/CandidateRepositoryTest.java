package com.fip.cbt.repositories;

import com.fip.cbt.models.Candidate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

//@DataJpaTest
@DataMongoTest
@RunWith(SpringRunner.class)
public class CandidateRepositoryTest {
    @Autowired
    CandidateRepository candidateRepository;

    //@Autowired
    //private MongoTemplate mongoTemplate;

    @Test
    public void createAndDeleteCandidate(){
        //given
        Candidate alice = new Candidate().setFirstName("Alice")
                .setLastName("Alex")
                .setUsername("aalex")
                .setPassword("aliceAlex123");
        Candidate bob = new Candidate()
                .setFirstName("Robert")
                .setLastName("Reed")
                .setUsername("bobreed")
                .setPassword("bobbyreeder12");
        candidateRepository.saveAll(List.of(alice, bob));

        //when
        List<Candidate> candidates = candidateRepository.findAll();

        //then
        assertThat(candidates.size()).isEqualTo(2);

        //when
        candidateRepository.deleteAll();
        List<Candidate> candidates1 = candidateRepository.findAll();

        //then
        assertThat(candidates1.size()).isEqualTo(0);
    }
}
