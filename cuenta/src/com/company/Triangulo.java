package com.company;

public class Triangulo extends DosDimensiones {
    double base,altura;
    String estilo;


    double area(){
        return base*altura/2;
    }

    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }




}
