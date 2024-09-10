package io.awesome.stuff.VitalsHttpSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class MeasurementService {
    private RestClient restClient;
    private final Random random = new Random();

    public MeasurementService(RestClient restClient) {
        this.restClient = restClient;
    }

    @Scheduled(fixedRate = 10000) // Schedule to run every 10 seconds
    public void sendMeasurement() {
        Measurement measurement = new Measurement();
        measurement.setPatientId(UUID.fromString("e148046d-e020-4303-937c-397439cfb832"));
        measurement.setDeviceId(UUID.fromString("7cc1ca2a-87b8-467a-b2ce-4052974e043f"));
        measurement.setMeasurementType("blood pressure");
        measurement.setMeasuredAt("2021-02-23t22:06:00.000z");
        measurement.setSignalStrengthPercentage(94);
        measurement.setBatteryPercentage(58);
        measurement.setDeviceType("pylobp");
        measurement.setDeviceModel("py-802-lte");

        Measurement.Value diastolic = new Measurement.Value();
        diastolic.setValue(generateRandomValue(60, 79)); // Normal range for diastolic: 60-79
        diastolic.setType("diastolic");

        Measurement.Value systolic = new Measurement.Value();
        systolic.setValue(generateRandomValue(90, 120)); // Normal range for systolic: 90-120
        systolic.setType("systolic");

        Measurement.Value pulse = new Measurement.Value();
        pulse.setValue(generateRandomValue(60, 100)); // Normal range for pulse: 60-100
        pulse.setType("pulse");

        Measurement.Value irregular = new Measurement.Value();
        irregular.setValue(0);
        irregular.setType("irregular");

        measurement.setValues(List.of(diastolic, systolic, pulse, irregular));

        restClient.sendMeasurement(measurement);
    }

    private int generateRandomValue(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }
}
