package com.fip.cbt.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Set;

@Document(collection = "questions")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Accessors(chain = true)
public class Question {

    //@Transient
    //public static final String SEQUENCE_NAME = "question_sequence";

    @Id
    private Long id;

    //private int number;

    private String text;

    @ElementCollection
    private Set<String> options;

    private String answer;

    //private QuestionType questionType;

    private Double scorePoint;
}
