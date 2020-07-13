package com.example.niketraining.listData;

public class ListData_3args {

    private String title;
    private String description;
    private int imgId;

    public ListData_3args(String description, int imgId, String title) {
        this.imgId = imgId;
        this.title = title;
        this.description = description;
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
