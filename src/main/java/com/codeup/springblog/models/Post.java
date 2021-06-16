package com.codeup.springblog.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String body;

    @OneToOne
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<PostImage> images;


    // Default Constructor //
    public Post(){}

    public Post(String title,String body, User user, List<PostImage> images) {
        this.title = title;
        this.body = body;
        this.user = user;
        this.images = images;
    }

    public Post(long id, String title, String body, User user, List<PostImage> images) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.user = user;
        this.images = images;
    }

    // Getters //
    public String getTitle() { return title;}
    public String getBody() { return body;}
    public long getId() {return id;}
    public User getUser() {return user;}
    public List<PostImage> getImages() {return images;}

    // Setters //
    public void setTitle(String title) { this.title = title; }
    public void setBody(String body) { this.body = body;}
    public void setId(long id) { this.id = id; }
    public void setUser(User user) { this.user = user; }
    public void setImages(List<PostImage> images) {this.images = images;}
}
