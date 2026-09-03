/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exclass05;

/**
 *
 * @author fatec-dsm2
 */
public class Produto {
    private String nomeProduto;
    private int quantidade;
    private double valor;
    private double total;

    public void cadastrarProduto(int quant) {
        this.quantidade = quant;
    }

    public double calcularTotal() {
        this.total = valor * quantidade;
        return total;
    }

    // Getters e Setters
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }
}