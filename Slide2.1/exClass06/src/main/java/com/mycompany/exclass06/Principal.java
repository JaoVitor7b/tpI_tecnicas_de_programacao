/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exclass06;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {
    public static void main(String[] args) {
        Loja loja = new Loja();

        // Inserindo dados via JOptionPane
        loja.inserirDadosLoja();

        // Exibindo resultado
        JOptionPane.showMessageDialog(null, loja.mostrarDadosLoja());
    }
}
