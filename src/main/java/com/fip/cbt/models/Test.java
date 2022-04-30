package com.fip.cbt.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

@Document(collection = "tests")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Accessors(chain = true)
public class Test {

    @Transient
    public static final String SEQUENCE_NAME = "exam_sequence";

    @Id
    private Long id;

    private String courseTitle;

    private String courseCode;

    private String description;

    private String instructions;

    private LocalDateTime start;

    private Duration duration;

    private boolean isTimed;

    @Cascade({
            org.hibernate.annotations.CascadeType.SAVE_UPDATE,
            org.hibernate.annotations.CascadeType.MERGE,
            org.hibernate.annotations.CascadeType.PERSIST
    })
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "test_questions",
            joinColumns = @JoinColumn(name = "test_id"),
            inverseJoinColumns = @JoinColumn(name = "question_id")
    )
    @ToString.Exclude
    private Set<Question> questions;

    @ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name="test_takers",
            joinColumns = @JoinColumn(name="test_id"),
            inverseJoinColumns = @JoinColumn(name = "test_taker_id")
    )
    private Set<Candidate> testTakers;

    private Double passMark;

    @CreationTimestamp
    private LocalDateTime created;
}
