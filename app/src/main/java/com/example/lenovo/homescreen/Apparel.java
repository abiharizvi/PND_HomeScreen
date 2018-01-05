package com.example.lenovo.homescreen;

/**
 * Created by lenovo on 31-Dec-17.
 */

public class Apparel {

    public Apparel(int id, String title, String shortdesc, String category, String subcategory, int image) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.category = category;
        this.subcategory = subcategory;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public String getCategory() {
        return category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public int getImage() {
        return image;
    }

    private int id ;
    private  String title , shortdesc;
    private String category;
    private String subcategory;
    private int image;

}
