package com.example.yuzelli.transparentwallpaper.bean;

import java.io.Serializable;

/**
 * Created by 51644 on 2017/5/31.
 */

public class MVBean implements Serializable {
    private String title;
    private String mvSrc;
    private int imgName;

    public MVBean(String title, String mvSrc, int imgName) {
        this.title = title;
        this.mvSrc = mvSrc;
        this.imgName = imgName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMvSrc() {
        return mvSrc;
    }

    public void setMvSrc(String mvSrc) {
        this.mvSrc = mvSrc;
    }

    public int getImgName() {
        return imgName;
    }

    public void setImgName(int imgName) {
        this.imgName = imgName;
    }
}
