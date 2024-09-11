package io.awesome.stuff.MongoDbClient.service;

import io.awesome.stuff.MongoDbClient.model.PatientVitals;
import io.awesome.stuff.MongoDbClient.repository.PatientVitalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientVitalsService {
    @Autowired
    private PatientVitalsRepository repository;

    public List<PatientVitals> getAllVitals() {
        return repository.findAll();
    }

    public PatientVitals saveVital(PatientVitals vital) {
        return (PatientVitals) repository.save(vital);
    }
}
