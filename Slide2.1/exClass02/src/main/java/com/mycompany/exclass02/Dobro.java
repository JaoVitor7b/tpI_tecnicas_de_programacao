/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exclass02;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Dobro {
    private Double numero;
    private Double calculo;

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public Double getCalculo() {
        return calculo;
    }

    public void setCalculo(Double calculo) {
        this.calculo = calculo;
    }
   
    public void calculoDobro() {
    setNumero(Double.valueOf(
        JOptionPane.showInputDialog("Digite o Número:")
    ));

    double dobro = getNumero() * 2;

    JOptionPane.showMessageDialog(null,"O dobro é: " + dobro);
}
}
