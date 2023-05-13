package com.abedkhan.catsshaven.Models;

public class CetagoryModels {
    String cetagoryname;
    int cetagoryImg;

    public CetagoryModels(String cetagoryname, int cetagoryImg) {
        this.cetagoryname = cetagoryname;
        this.cetagoryImg = cetagoryImg;
    }


    public String getCetagoryname() {
        return cetagoryname;
    }

    public void setCetagoryname(String cetagoryname) {
        this.cetagoryname = cetagoryname;
    }

    public int getCetagoryImg() {
        return cetagoryImg;
    }

    public void setCetagoryImg(int cetagoryImg) {
        this.cetagoryImg = cetagoryImg;
    }
}
