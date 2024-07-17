package com.api.kataproject.repository;

import com.api.kataproject.entity.LocationEntity;
import com.api.kataproject.entity.WeatherEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WeatherRepository extends MongoRepository<WeatherEntity, String> {
    Optional<WeatherEntity> findByLocationId(LocationEntity location);
}
