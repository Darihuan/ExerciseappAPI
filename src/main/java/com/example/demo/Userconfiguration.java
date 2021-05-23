package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Exercise;
import com.example.demo.model.User;
import com.example.demo.repository.IExerciseRepository;
import com.example.demo.repository.IUserRepository;


@Configuration
public class Userconfiguration {


		@Bean
		CommandLineRunner commandLineRunner(IUserRepository repository,IExerciseRepository exerciserep) {
			return args -> {
				User usuario1=new User("mes@esa.com","1234");
				User usuario2=new User("n@a.com","5678");
				Exercise ejemplo1=new Exercise("Saltar comba", 30);
				Exercise ejemplo2=new Exercise("salto olimpico", 40);
				Exercise ejemplo3=new Exercise("sillonball", 90);
				repository.saveAll(List.of(usuario1,usuario2));
				exerciserep.saveAll(List.of(ejemplo1,ejemplo2,ejemplo3));

			};
		
		}

	}


