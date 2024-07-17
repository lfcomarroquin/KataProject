package com.api.kataproject.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "weather")
public class WeatherEntity {

    @Id
    private String id;
    private String temp;
    private String pressure;
    private String humidity;
    private LocationEntity location;

    public WeatherEntity(String id, String temp, String pressure, String humidity, LocationEntity location) {
        this.id = id;
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.location = location;
    }

    public WeatherEntity() {

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

    public LocationEntity getLocation() {
        return location;
    }

    public void setLocation(LocationEntity location) {
        this.location = location;
    }

}