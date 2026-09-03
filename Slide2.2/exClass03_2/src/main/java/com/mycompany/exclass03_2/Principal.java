/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exclass03_2;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {

        IdadePessoa pessoa = new IdadePessoa();

        int anoNascimento = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Digite o ano de nascimento:"
            )
        );

        int anoAtual = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Digite o ano atual:"
            )
        );

        pessoa.setAno(anoNascimento);
        pessoa.setAnoAtual(anoAtual);

        pessoa.calcularIdade();

        JOptionPane.showMessageDialog(
            null,
            "Ano de nascimento: " + pessoa.getAno()
            + "\nAno atual: " + pessoa.getAnoAtual()
            + "\nIdade: " + pessoa.getIdade() + " anos"
        );
    }
}
