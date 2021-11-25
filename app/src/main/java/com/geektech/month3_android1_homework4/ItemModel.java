package com.geektech.month3_android1_homework4;

import java.io.Serializable;
import java.util.List;

public class ItemModel implements Serializable {
    private String title;
    private int image;
    private List<String> flags;

    public ItemModel(String title, int image, List<String> flags) {
        this.title = title;
        this.image = image;
        this.flags = flags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public List<String> getFlags() {
        return flags;
    }

    public void setFlags(List<String> flags) {
        this.flags = flags;
    }


}
