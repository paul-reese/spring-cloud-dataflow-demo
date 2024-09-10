package io.awesome.stuff.VitalsHttpSender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClient {
    private final RestTemplate restTemplate;
    private static final Logger logger = LoggerFactory.getLogger(RestClient.class);

    public RestClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // Send a measurement object to the Vitals server
    public void sendMeasurement(Measurement measurement) {
        String url = "http://localhost:20120";
        logger.info("Sending measurement to URL: {}", url);
        logger.info("Measurement object: {}", measurement.toString());

        restTemplate.postForObject(url, measurement, String.class);
    }
}
