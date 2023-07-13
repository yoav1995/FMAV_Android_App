package com.example.final_app_fmav.Models;

public class Vehicle {

    private int cc,km;
    private int price;

    private int type;
    private String picUrl;
    private String details,title;

    private boolean isFavorite = false;

    public Vehicle() {
    }


    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite() {
        this.isFavorite= !this.isFavorite;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public String getDetails() {
        return details;
    }

    public String getTitle() {
        return title;
    }

    public Vehicle setTitle(String title) {
        this.title = title;
        return this;
    }

    public int getCc() {
        return cc;
    }

    public int getKm() {
        return km;
    }


    public int getPrice() {
        return price;
    }

    public Vehicle setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public Vehicle setCc(int cc) {
        this.cc = cc;
        return this;
    }
    public Vehicle setDetails(String details) {
        this.details = details;
        return this;
    }
    public Vehicle setKm(int km) {
        this.km = km;
        return this;
    }

    public Vehicle setPrice(int price) {
        this.price = price;
        return this;
    }
    public Vehicle setType(int type){
        // type 0 for car and 1 for bike
        this.type=type;
        return this;
    }
    public int getType() {
        return this.type;
    }

}
