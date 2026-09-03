/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exclass02_2;

/**
 *
 * @author fatec-dsm2
 */

public class Quadrado {

    private double numero;
    private double resultado;

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getNumero() {
        return numero;
    }

    public double getResultado() {
        return resultado;
    }

    public void calcularQuadrado() {
        resultado = Math.pow(numero, 2);
    }

    public void mostrarQuadrado() {
        System.out.println("Resultado: " + resultado);
    }
}
