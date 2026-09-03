/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exclass02;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Dobro dob = new Dobro();

        double numero = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o Número:")
        );

        dob.setNumero(numero);
        dob.calculoDobro();

        JOptionPane.showMessageDialog(null,"O dobro é: " + dob.getNumero()
        );
    }
}
