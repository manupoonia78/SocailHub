package com.example.Socialhub.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "status")
public class Status {

    @Id
    private Integer id;

    private String name;
    private String desc;
    private String file;
    private String comment_user;
    private String comment;
}
