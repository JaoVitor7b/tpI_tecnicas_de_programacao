/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetocalculadoraoo;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
        //instanciar um objeto
        Calculadora calc = new Calculadora();
        
        int op;
        double a,b;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n1-Somar \n2-Subtrair \n3-Multiplicar \n4-Dividir \n0-Sair"));
            switch(op)
            {
                case 1:
                    calc.Somar();
                    break;
                case 2:
                    a=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                    b=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));

                    calc.Subtrair(a, b);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "O valor da multiplicacao "+calc.Multiplicar());
                    break;
                case 4:
                    a=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                    b=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
                    JOptionPane.showMessageDialog(null, "O valor da divisao "+calc.divisao(a,b));
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta");
                    break;
            }
        } while(op != 0);
    }
}