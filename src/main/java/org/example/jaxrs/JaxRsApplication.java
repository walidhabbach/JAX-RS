package org.example.jaxrs;

import org.example.jaxrs.entities.Compte;
import org.example.jaxrs.entities.enums.TypeCompte;
import org.example.jaxrs.repository.CompteRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import aj.org.objectweb.asm.Type;

import java.util.Date;

@SpringBootApplication
public class JaxRsApplication{

	public static void main(String[] args) {
		SpringApplication.run(JaxRsApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args -> {

			compteRepository.save(
					new Compte(null,Math.random()*9000,new Date(), TypeCompte.EPARGNE));
			compteRepository.save(
					new Compte(null,Math.random()*9000,new Date(),TypeCompte.EPARGNE));

			compteRepository.findAll().forEach(c -> {
				System.out.println(c.toString());
			});
		};
	}
}
