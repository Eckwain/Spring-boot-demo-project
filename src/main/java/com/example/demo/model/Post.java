package com.example.demo.model;

public class Post {
    private String text;
    private Integer likes;

    public Post (String txt, int lks){
        text = txt;
        likes = lks;
    }

    public String getText(){
        return text;
    }

    public Integer getLikes(){
        return likes;
    }
}
