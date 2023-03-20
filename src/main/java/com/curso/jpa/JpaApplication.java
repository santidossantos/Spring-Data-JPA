package com.curso.jpa;

import com.curso.jpa.model.Client;
import com.curso.jpa.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Timestamp;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ClientRepository clientRepository) {
		return args -> {
			Client client = new Client(
					null,
					"Jorge",
					true,
					new Timestamp(System.currentTimeMillis()),
					"jorge@gmail.com",
					"1234"
			);
			clientRepository.save(client);
			Client aux = clientRepository.findByIdAndActive(1L, true);
			System.out.println(aux.toString());
		};
	}

}
