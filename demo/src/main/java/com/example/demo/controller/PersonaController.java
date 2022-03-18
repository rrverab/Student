package com.example.demo.controller;

import com.example.demo.Entity.Persona;

import com.example.demo.Entity.DemoApplication;
import com.example.demo.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PersonaController {
@Autowired
    PersonaServicio personaServicio;

@GetMapping(value = "list", produces = "application/json")
    public List<Persona> getPersonaAll(){
        return personaServicio.getAllPerson();

}









}
