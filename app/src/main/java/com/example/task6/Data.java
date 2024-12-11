package com.example.task6;

import android.widget.TextView;

public class Data {
    private String title;
    private String content;
    private int imageId;

    public Data(String title, String content, int imageId) {
        this.title = title;
        this.content = content;
        this.imageId = imageId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getImageId() {
        return imageId;
    }
}
