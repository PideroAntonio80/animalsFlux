package com.sanvalero.animalsFlux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class AnimalsFluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalsFluxApplication.class, args);
	}

}
