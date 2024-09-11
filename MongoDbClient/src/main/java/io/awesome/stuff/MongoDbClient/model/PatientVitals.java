package io.awesome.stuff.MongoDbClient.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "patient-vitals")
public class PatientVitals {

    @Id
    private String id;
    private String patientId;
    private String vitalType;
    private int vitalValue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getVitalType() {
        return vitalType;
    }

    public void setVitalType(String vitalType) {
        this.vitalType = vitalType;
    }

    public int getVitalValue() {
        return vitalValue;
    }

    public void setVitalValue(int vitalValue) {
        this.vitalValue = vitalValue;
    }
}
