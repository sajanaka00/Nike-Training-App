package com.example.niketraining.listData;

public class ListData_1imgView_1textView {

    private String title;
    private int imgId;

    public ListData_1imgView_1textView(String title, int imgId) {
        this.title = title;
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
}