package io.awesome.stuff.MongoDbClient;

import io.awesome.stuff.MongoDbClient.model.PatientVitals;
import io.awesome.stuff.MongoDbClient.repository.PatientVitalsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Random;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "io.awesome.stuff.MongoDbClient.repository")
public class MongoDbClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(MongoDbClientApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(PatientVitalsHelper helper) {
		return args -> {
			helper.createAndSavePatientVital("patient123", "heartRate", 72);
		};
	}
}