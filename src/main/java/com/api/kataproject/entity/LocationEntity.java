package com.api.kataproject.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "location")
public class LocationEntity {

    @Id
    private String id;
    private String city;
    private String country;
    private String region;

    public LocationEntity(String id, String city, String country, String region) {
        this.id = id;
        this.city = city;
        this.country = country;
        this.region = region;
    }

    public LocationEntity() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}