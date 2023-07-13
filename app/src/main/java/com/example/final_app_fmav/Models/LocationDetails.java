package com.example.final_app_fmav.Models;

public class LocationDetails {

    private double lat,lng;
    private String title;


    public LocationDetails setTitle(String title) {
        this.title = title;
        return this;
    }
    public LocationDetails setLat(double lat) {
        this.lat = lat;
        return this;
    }
    public LocationDetails setLng(double lng) {
        this.lng = lng;
        return this;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public String getTitle() {
        return title;
    }
}
