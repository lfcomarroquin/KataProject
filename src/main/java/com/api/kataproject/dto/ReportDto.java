package com.api.kataproject.dto;

public class ReportDto {

    private LocationDto location;

    private WeatherDto weather;

    public ReportDto(LocationDto location, WeatherDto weather) {
        this.location = location;
        this.weather = weather;
    }

    public ReportDto() {

    }

    public LocationDto getLocation() {
        return location;
    }

    public void setLocation(LocationDto location) {
        this.location = location;
    }

    public WeatherDto getWeather() {
        return weather;
    }

    public void setWeather(WeatherDto weather) {
        this.weather = weather;
    }
}
