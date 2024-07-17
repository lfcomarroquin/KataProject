package com.api.kataproject.service;

import com.api.kataproject.dto.LocationDto;
import com.api.kataproject.dto.ReportDto;
import com.api.kataproject.dto.WeatherDto;
import com.api.kataproject.entity.LocationEntity;
import com.api.kataproject.entity.WeatherEntity;
import com.api.kataproject.repository.LocationRepository;
import com.api.kataproject.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    @Autowired
    private LocationRepository locationRepository;

    public ReportDto findByLocationId(String id) {
        LocationEntity location = this.locationRepository.findById(id).get();
        WeatherEntity weather = this.weatherRepository.findByLocationId(location).get();
        return this.toDto(weather);
    }

    public WeatherDto save(WeatherDto weatherDto) {
        LocationEntity location = this.locationRepository.findById(weatherDto.getLocationID()).get();
        WeatherEntity entity = new WeatherEntity();
        entity.setHumidity(weatherDto.getHumidity());
        entity.setPressure(weatherDto.getPressure());
        entity.setTemp(weatherDto.getTemp());
        entity.setLocation(location);
        weatherDto.setId(entity.getId());
        return weatherDto;
    }

    private ReportDto toDto(WeatherEntity entity) {
        ReportDto dto = new ReportDto();

        final WeatherDto weatherDto = new WeatherDto();
        weatherDto.setHumidity(entity.getHumidity());
        weatherDto.setPressure(entity.getPressure());
        weatherDto.setTemp(entity.getTemp());
        weatherDto.setId(entity.getId());
        weatherDto.setLocationID(entity.getLocation().getId());
        dto.setWeather(weatherDto);

        final LocationDto locationDto = new LocationDto();
        locationDto.setCity(entity.getLocation().getCity());
        locationDto.setCountry(entity.getLocation().getCountry());
        locationDto.setRegion(entity.getLocation().getRegion());
        locationDto.setId(entity.getLocation().getId());
        dto.setLocation(locationDto);
        return dto;
    }

}