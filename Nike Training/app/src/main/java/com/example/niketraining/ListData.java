package com.example.niketraining;

public class ListData {

    private String title;
    private String description;
    private int imgId;

    public ListData(String description, int imgId, String title) {
        this.description = description;
        this.imgId = imgId;
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
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
}
