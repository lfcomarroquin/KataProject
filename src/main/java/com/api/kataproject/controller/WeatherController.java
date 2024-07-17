package com.api.kataproject.controller;

import com.api.kataproject.dto.ReportDto;
import com.api.kataproject.dto.WeatherDto;
import com.api.kataproject.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{id}")
    public ReportDto findById(@PathVariable String id) {
        return weatherService.findByLocationId(id);
    }

    @PostMapping("/")
    public ResponseEntity<WeatherDto> create(@RequestBody WeatherDto weatherDto) {
        return ResponseEntity.ok(weatherService.save(weatherDto));
    }

}