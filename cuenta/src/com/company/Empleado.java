package com.company;





public class Empleado {
    /**
     * Contiene el primer nombre del empleado.
     */
    String primerNombre = "";
    /**
     * Contiene el apellido paterno del empleado.
     */
    String apellidoPaterno = "";
    /**
     * Contiene el salario mensual del empleado.
     */
    double salarioMensual = 0.0;

    /**
     * Constructor de Empleado que inicializa el nombre,
     * apellido paterno y salario del empleado.
     */
    public Empleado(String primerNombre,
                    String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        if(salarioMensual < 0) {
            this.salarioMensual = 0.0;
        } else {
            this.salarioMensual = salarioMensual;
        }
    }

    /**
     * Este es un getter que obtiene el primerNombre.
     * return el primerNombre String.
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Este es un setter que asigna el primerNombre.
     */


    /**
     * Este es un getter que obtiene el apellidoPaterno.
     * return el apellidoPaterno String.
     */


    /**
     * Este es un setter que asigna el apellidoPaterno.
     * @param apellidoPaterno de tipo String el
     * apellidoPaterno a asignar.
     */


    /**
     * Este es un getter que obtiene el salarioMensual.
     * @return el salarioMensual double.
     */


    /**
     * Este es un setter que asigna el salarioMensual.
     * @param salarioMensual de tipo double el
     * salarioMensual a asignar.
     */


    /**
     * Método encargado de realizar un aumento en el
     * salario mensual del 10%.
     */
    public void aumento() {
        this.salarioMensual = this.salarioMensual * 1.10;
    }
}
