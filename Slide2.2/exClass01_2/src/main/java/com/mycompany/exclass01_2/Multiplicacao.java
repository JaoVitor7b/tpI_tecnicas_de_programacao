/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exclass01_2;

/**
 *
 * @author fatec-dsm2
 */
public class Multiplicacao {

    private int valor;
    private int resultado;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void multiplicacao10() {
        resultado = valor * 10;
    }

    public void MostrarMultiplicacao() {
        System.out.println("Resultado: " + resultado);
    }
}
