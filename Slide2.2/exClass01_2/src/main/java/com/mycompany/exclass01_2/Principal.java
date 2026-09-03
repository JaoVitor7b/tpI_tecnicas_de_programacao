/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exclass01_2;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {

        Multiplicacao mult = new Multiplicacao();

        int valor = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um valor:")
        );

        mult.setValor(valor);

        mult.multiplicacao10();

        JOptionPane.showMessageDialog(
            null,
            "Valor digitado: " + mult.getValor()
            + "\nMultiplicado por 10: " + mult.getResultado()
        );
    }
}