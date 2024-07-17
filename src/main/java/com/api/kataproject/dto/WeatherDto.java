package com.api.kataproject.dto;

import javax.xml.stream.Location;

public class WeatherDto {
    private String id;
    private String temp;
    private String pressure;
    private String humidity;
    private String location;
    private String locationID;

    public WeatherDto(String id, String temp, String pressure, String humidity, String location, String weather, String locationID) {
        this.id = id;
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.location = location;
        this.locationID = locationID;
    }

    public WeatherDto() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

}