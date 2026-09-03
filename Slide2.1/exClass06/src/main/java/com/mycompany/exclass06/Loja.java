/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exclass06;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Loja {
    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private int qtdItensComp;
    private double valorTotalCompra;

    public void inserirDadosLoja() {
        razaoSocial = JOptionPane.showInputDialog("Digite a razão social da loja:");
        cpfCliente = JOptionPane.showInputDialog("Digite o CPF do cliente:");
        valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra:"));
        qtdItensComp = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens:"));
    }

    public double calcularCompraLoja() {
        valorTotalCompra = valorCompra * qtdItensComp;
        return valorTotalCompra;
    }

    public String mostrarDadosLoja() {
        return "Razão Social: " + razaoSocial +
               "\nCPF Cliente: " + cpfCliente +
               "\nValor Unitário da Compra: R$ " + valorCompra +
               "\nQuantidade de Itens: " + qtdItensComp +
               "\nValor Total da Compra: R$ " + calcularCompraLoja();
    }
}
