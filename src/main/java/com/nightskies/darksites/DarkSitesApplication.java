package com.nightskies.darksites;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nightskies.darksites.models.Contribution;
import com.nightskies.darksites.services.ContributionsService;

@SpringBootApplication
public class DarkSitesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DarkSitesApplication.class, args);
	}
	
//	@Bean
//	CommandLineRunner runner(ContributionsService service) {
//		
//	}

}
