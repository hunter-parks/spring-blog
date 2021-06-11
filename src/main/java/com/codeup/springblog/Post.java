package com.codeup.springblog;

public class Post {

    private String title;
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
