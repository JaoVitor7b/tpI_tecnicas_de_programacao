/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.execlass04;

import javax.swing.JOptionPane;
/**
 *
 * @author fatec-dsm2
 */


public class Principal {
    public static void main(String[] args) {
        Fornecedores fornecedor = new Fornecedores();

        // Entrada de dados via JOptionPane
        String nomeFornecedor = JOptionPane.showInputDialog("Digite o nome do fornecedor:");
        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
        String descricaoProduto = JOptionPane.showInputDialog("Digite a descrição do produto:");

        // Setando os valores
        fornecedor.setNomeFornecedor(nomeFornecedor);
        fornecedor.setDescricaoProduto(descricaoProduto);
        fornecedor.cadastrarFornecedor(nomeProduto);

        // Exibindo resultado
        JOptionPane.showMessageDialog(null, fornecedor.listarFornecedor());
    }
}
