package io.awesome.stuff.Vitals;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@SpringBootApplication
public class VitalsApplication {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) {
        SpringApplication.run(VitalsApplication.class, args);
    }

    @Bean
    public Function<Message<String>, Message<String>> process() {
        return message -> {
            try {
                // Deserialize the JSON to a Measurement object
                Measurement measurement = objectMapper.readValue(message.getPayload(), Measurement.class);

                // Process the Measurement object (for now just print it)
                System.out.println("measurement: " + measurement.toString());

                // Create new Vital object
                Vitals vitals = new Vitals();

                vitals.setPatientId(measurement.getPatientId());
                vitals.setDeviceId(measurement.getDeviceId());
                vitals.setMeasurementType(measurement.getMeasurementType());
                vitals.setMeasuredAt(measurement.getMeasuredAt());

                Map<String, Integer> valueMap = measurement.getValues().stream()
                        .collect(Collectors.toMap(Measurement.Value::getType,
                                                  Measurement.Value::getValue));
                vitals.setDiastolic(valueMap.get("diastolic"));
                vitals.setSystolic(valueMap.get("systolic"));
                vitals.setPulse(valueMap.get("pulse"));
                vitals.setIrregular(valueMap.get("irregular"));

                // Set the remainder of Vitals
                vitals.setSignalStrengthPercentage(measurement.getSignalStrengthPercentage());
                vitals.setBatteryPercentage(measurement.getBatteryPercentage());
                vitals.setDeviceType(measurement.getDeviceType());
                vitals.setDeviceModel(measurement.getDeviceModel());

                // Serialize the Measurement object back to JSON
                String processedPayload = objectMapper.writeValueAsString(vitals);

                // Construct a new Message and return
                return MessageBuilder.withPayload(processedPayload)
                        .copyHeaders(message.getHeaders())
                        .build();
            } catch (Exception e) {
                throw new RuntimeException("Failed to process message", e);
            }
        };
    }
}
