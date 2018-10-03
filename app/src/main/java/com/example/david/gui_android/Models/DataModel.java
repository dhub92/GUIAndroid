package com.example.david.gui_android.Models;

public class DataModel {
    String name;
    String description;
    String value;
    int image;

    public DataModel(String name, String description, String value, int image) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
