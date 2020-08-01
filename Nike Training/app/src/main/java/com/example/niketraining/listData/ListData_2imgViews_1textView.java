package com.example.niketraining.listData;

public class ListData_2imgViews_1textView {

    private String title;
    private int imgId;
    private int imgId2;

    public ListData_2imgViews_1textView(int imgId, String title, int imgId2) {
        this.imgId = imgId;
        this.title = title;
        this.imgId2 = imgId2;
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

    public int getImgId2() {
        return imgId2;
    }

    public void setImgId2(int description) {
        this.imgId2 = description;
    }
}
