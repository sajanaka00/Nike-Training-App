package com.example.niketraining.listData;

public class ListData_3args {

    private String title;
    private String description;
    private int imgId;

    public ListData_3args(String title, String description, int imgId) {
        this.title = title;
        this.description = description;
        this.imgId = imgId;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}