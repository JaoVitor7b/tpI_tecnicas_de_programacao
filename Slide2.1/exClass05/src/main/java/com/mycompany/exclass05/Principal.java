/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exclass05;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();

        // Entrada de dados via JOptionPane
        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário:"));

        // Setando os valores
        produto.setNomeProduto(nomeProduto);
        produto.setValor(valor);
        produto.cadastrarProduto(quantidade);

        // Exibindo resultado
        JOptionPane.showMessageDialog(null,
            "Produto: " + produto.getNomeProduto() +
            "\nQuantidade: " + produto.getQuantidade() +
            "\nValor unitário: R$ " + produto.getValor() +
            "\nTotal: R$ " + produto.calcularTotal()
        );
    }
}
