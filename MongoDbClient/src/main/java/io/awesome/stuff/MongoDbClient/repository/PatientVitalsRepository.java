package io.awesome.stuff.MongoDbClient.repository;

import io.awesome.stuff.MongoDbClient.model.PatientVitals;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientVitalsRepository extends MongoRepository<PatientVitals, String> {
}
