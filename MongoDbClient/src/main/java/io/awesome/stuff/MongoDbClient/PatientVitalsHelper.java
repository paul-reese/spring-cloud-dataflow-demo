package io.awesome.stuff.MongoDbClient;

import io.awesome.stuff.MongoDbClient.model.PatientVitals;
import io.awesome.stuff.MongoDbClient.service.PatientVitalsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PatientVitalsHelper {
    private static final Logger logger = LoggerFactory.getLogger(PatientVitalsHelper.class);

    @Autowired
    private PatientVitalsService service;

    public void createAndSavePatientVital(String patientId, String vitalType, int vitalValue) {
        PatientVitals patientVitals = new PatientVitals();
        patientVitals.setPatientId(patientId);
        patientVitals.setVitalType(vitalType);
        patientVitals.setVitalValue(vitalValue);
        logger.info("Saving patient vital: {}", patientVitals.toString());

        PatientVitals returnVitals = service.saveVital(patientVitals);
    }
}
