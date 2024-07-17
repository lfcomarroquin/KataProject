package com.api.kataproject.service;

import com.api.kataproject.dto.LocationDto;
import com.api.kataproject.entity.LocationEntity;
import com.api.kataproject.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public  LocationDto save(LocationDto locationDto) {
        LocationEntity entity = new LocationEntity();
        entity.setCity(locationDto.getCity());
        entity.setCountry(locationDto.getCountry());
        entity.setRegion(locationDto.getRegion());
        entity = this.locationRepository.save(entity);
        locationDto.setId(entity.getId());
        return locationDto;
    }

}