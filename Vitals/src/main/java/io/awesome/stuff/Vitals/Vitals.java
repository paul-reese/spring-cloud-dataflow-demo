package io.awesome.stuff.Vitals;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;

public class Vitals {
    @JsonProperty("patient_id")
    private UUID patientId;

    @JsonProperty("device_id")
    private UUID deviceId;

    @JsonProperty("measurement_type")
    private String measurementType;

    @JsonProperty("measured_at")
    private String measuredAt; // consider using a proper Date type

    // Flattened `values` attributes
    private int diastolic;

    private int systolic;

    private int pulse;

    private int irregular;

    @JsonProperty("signal_strength_percentage")
    private int signalStrengthPercentage;

    @JsonProperty("battery_percentage")
    private int batteryPercentage;

    @JsonProperty("device_type")
    private String deviceType;

    @JsonProperty("device_model")
    private String deviceModel;

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

    public UUID getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(UUID deviceId) {
        this.deviceId = deviceId;
    }

    public String getMeasurementType() {
        return measurementType;
    }

    public void setMeasurementType(String measurementType) {
        this.measurementType = measurementType;
    }

    public String getMeasuredAt() {
        return measuredAt;
    }

    public void setMeasuredAt(String measuredAt) {
        this.measuredAt = measuredAt;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getIrregular() {
        return irregular;
    }

    public void setIrregular(int irregular) {
        this.irregular = irregular;
    }

    public int getSignalStrengthPercentage() {
        return signalStrengthPercentage;
    }

    public void setSignalStrengthPercentage(int signalStrengthPercentage) {
        this.signalStrengthPercentage = signalStrengthPercentage;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }
}
