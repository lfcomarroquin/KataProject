package com.api.kataproject.controller;

import com.api.kataproject.dto.LocationDto;
import com.api.kataproject.entity.LocationEntity;
import com.api.kataproject.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping("/")
    public ResponseEntity<LocationDto> createLocation(@RequestBody LocationDto locationDto) {
        LocationDto savedLocation = this.locationService.save(locationDto);
        return ResponseEntity.ok(savedLocation);
    }
}