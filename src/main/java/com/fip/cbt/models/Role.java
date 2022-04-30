package com.fip.cbt.models;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.persistence.Transient;


@Document(collection = "roles")
public class Role {
    //@Transient
    //public static final String SEQUENCE_NAME = "roles_sequence";

    @Id
    private long id;

    private String name;

}
