package com.abedkhan.catsshaven.Models;

public class CatModel {
    String name;
    int img;

    public CatModel(String name, int img) {
        this.name = name;
        this.img = img;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
