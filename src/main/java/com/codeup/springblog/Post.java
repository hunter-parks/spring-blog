package com.codeup.springblog;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String body;

    // Default Constructor //
    public Post(){}

    public Post(String title,String body) {
        this.title = title;
        this.body = body;
    }

    // Getters //
    public String getTitle() { return title;}
    public String getBody() { return body;}

    // Setters //
    public void setTitle(String title) { this.title = title; }
    public void setBody(String body) { this.body = body;}

}
