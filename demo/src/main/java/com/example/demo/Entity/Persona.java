package com.example.demo.Entity;

public class Persona {
public int id;
public String name;
public int age;

    public Persona() {
    }

    public Persona(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;


    }





    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;

    }



    public void setName (String name) {

        this.name= name;


    }



}
