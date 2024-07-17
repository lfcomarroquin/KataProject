package com.api.kataproject.repository;

import com.api.kataproject.entity.LocationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends MongoRepository<LocationEntity, String> {
}
