package com.api.kataproject.dto;

public class LocationDto {
    private String id;
    private String city;
    private String country;
    private String region;

    public LocationDto(String id, String city, String country, String region, String location) {
        this.id = id;
        this.city = city;
        this.country = country;
        this.region = region;
    }

    public LocationDto() {

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