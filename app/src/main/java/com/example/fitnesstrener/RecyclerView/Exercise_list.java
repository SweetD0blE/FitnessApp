package com.example.fitnesstrener.RecyclerView;

public class Exercise_list {
    String name;
    String img_url;

    public Exercise_list(){
    }

    public Exercise_list(String name, String img_url) {
        this.name = name;
        this.img_url = img_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}
