package com.example.administrator.myapplication;

/**
 * Created by Administrator on 2016-11-11.
 */

public class Light {
    private int image;
    private String title;
    private String content;

    public Light(int image, String title, String content) {
        this.image = image;
        this.title = title;
        this.content = content;
    }

    public Light(){

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
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
}
