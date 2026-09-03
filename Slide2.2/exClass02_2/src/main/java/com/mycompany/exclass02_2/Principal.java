/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exclass02_2;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();

        double numero = Double.parseDouble(
            JOptionPane.showInputDialog("Digite um número:")
        );

        quadrado.setNumero(numero);

        quadrado.calcularQuadrado();

        JOptionPane.showMessageDialog(
            null,
            "Número digitado: " + quadrado.getNumero()
            + "\nQuadrado do número: " + quadrado.getResultado()
        );
    }
}
