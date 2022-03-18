package com.example.demo;

import com.example.demo.Entity.DemoApplication;
import com.example.demo.Entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service

public class PersonaServicio {
@Autowired
    DemoApplication demoApplication;

    public List<Persona> getAllPerson(){
        return demoApplication.people;

    }



}
