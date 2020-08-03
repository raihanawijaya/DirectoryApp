package com.raihana.directoryapp.model;

public class DirectoryModel {

    private String Title, Date, Caption, Fav, Image;

    public DirectoryModel() {
    }

    public DirectoryModel(String title, String date, String caption, String fav, String image) {
        Title = title;
        Date = date;
        Caption = caption;
        Fav = fav;
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getCaption() {
        return Caption;
    }

    public void setCaption(String caption) {
        Caption = caption;
    }

    public String getFav() {
        return Fav;
    }

    public void setFav(String fav) {
        Fav = fav;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
