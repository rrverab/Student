package com.company;






public class pruebaEmpleado {

    public static void main(String[] args) {


        Triangulo t1=new Triangulo();
        Triangulo t2=new Triangulo();

        t1.base=4.0;
        t1.altura=4.0;
        t1.estilo="Estilo 1";

        t2.base=8.0;
        t2.altura=12.0;
        t2.estilo="Estilo 2";

        System.out.println("Información para T1: ");
        t1.mostrarEstilo();
        t1.mostrarDimension();
        System.out.println("Su área es: "+t1.area());

        System.out.println();

        System.out.println("Información para T2: ");
        t2.mostrarEstilo();
        t2.mostrarDimension();
        System.out.println("Su área es: "+t2.area());





    }




}