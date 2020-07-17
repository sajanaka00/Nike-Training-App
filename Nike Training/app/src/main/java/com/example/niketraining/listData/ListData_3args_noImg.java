package com.example.niketraining.listData;

public class ListData_3args_noImg  {

    private String title;
    private String description;
    private String description2;

    public ListData_3args_noImg(String title, String description, String description2) {
        this.title = title;
        this.description = description;
        this.description2 = description2;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
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
