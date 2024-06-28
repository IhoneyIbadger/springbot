package com.example.demo;

import java.util.Date;

public class BlogPost {

    private String title;
    private String content;
    private String author;
    private Date publishDate;

    public BlogPost(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = System.getProperty("user.name");
        this.publishDate = new Date();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}

