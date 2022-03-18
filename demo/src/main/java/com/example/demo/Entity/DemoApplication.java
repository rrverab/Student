package com.example.demo.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class DemoApplication {



	public static List<Persona> people = new ArrayList();

	public static void main(String[] args) {
          people.add(new Persona(1,"jorge",23));
          people.add(new Persona(2,"lalo",26));
          people.add(new Persona(3,"toto",27));




		SpringApplication.run(DemoApplication.class, args);


	}





}
