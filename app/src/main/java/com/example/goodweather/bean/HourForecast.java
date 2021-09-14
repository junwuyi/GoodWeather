package com.example.goodweather.bean;

public class HourForecast {

    private String hour;
    private String imageId;
    private String temp;

    public String getTemp() {
        return temp;
    }

    public HourForecast(String hour, String imageId, String temp) {
        this.hour = hour;
        this.imageId = imageId;
        this.temp = temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getName() {
        return hour;
    }

    public String getImageId() {
        return imageId;
    }
}
