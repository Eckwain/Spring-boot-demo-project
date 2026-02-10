package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id; // Новое поле
    private String text;
    private Integer likes;
    private Date creationDate;

    // Обновленный конструктор
    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;
    }
    public Post(){

    }

    public Long getId() { return id; }

    public String getText() { return text; }

    public Integer getLikes() { return likes; }

    public Date getCreationDate() { return creationDate; }

    public void setLikes(Integer likes) { // Сеттер нужен для изменения лайков
        this.likes = likes;
    }
}