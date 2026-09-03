/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exclass03;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {
    
    public static void main(String[] args) {
        //Instanciar Objeto
        Passageiros pass = new Passageiros();
        

        String rg = (JOptionPane.showInputDialog("Digite o Rg"));

        pass.cadadstrarCliente(rg);

        
        JOptionPane.showMessageDialog(null, pass.listarCliente());
        
    }
}
