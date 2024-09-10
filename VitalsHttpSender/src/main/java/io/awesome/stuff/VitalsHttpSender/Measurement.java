package io.awesome.stuff.VitalsHttpSender;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;

public class Measurement {
    @JsonProperty("patient_id")
    private UUID patientId;

    @JsonProperty("device_id")
    private UUID deviceId;

    @JsonProperty("measurement_type")
    private String measurementType;

    @JsonProperty("measured_at")
    private String measuredAt;

    @JsonProperty("values")
    private List<Value> values;

    @JsonProperty("signal_strength_percentage")
    private int signalStrengthPercentage;

    @JsonProperty("battery_percentage")
    private int batteryPercentage;

    @JsonProperty("device_type")
    private String deviceType;

    @JsonProperty("device_model")
    private String deviceModel;

    // Getters and setters...
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

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
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

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

    public static class Value {
        @JsonProperty("value")
        private int value;

        @JsonProperty("type")
        private String type;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Value{" +
                    "value=" + value +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Measurement{" +
                "patientId=" + patientId +
                ", deviceId=" + deviceId +
                ", measurementType='" + measurementType + '\'' +
                ", measuredAt='" + measuredAt + '\'' +
                ", values=" + values.toString() +
                ", signalStrengthPercentage=" + signalStrengthPercentage +
                ", batteryPercentage=" + batteryPercentage +
                ", deviceType='" + deviceType + '\'' +
                ", deviceModel='" + deviceModel + '\'' +
                '}';
    }
}