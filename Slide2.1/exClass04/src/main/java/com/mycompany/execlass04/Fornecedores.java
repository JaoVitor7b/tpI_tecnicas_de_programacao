/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.execlass04;

/**
 *
 * @author fatec-dsm2
 */
public class Fornecedores {
    private String nomeFornecedor;
    private String nomeProduto;
    private String descricaoProduto;

    public void cadastrarFornecedor(String nomeProduto) {
        this.nomeProduto = nomeProduto;
        System.out.println("Produto cadastrado: " + nomeProduto);
    }

    public String listarFornecedor() {
        return "Fornecedor: " + nomeFornecedor + 
               ", Produto: " + nomeProduto + 
               ", Descrição: " + descricaoProduto;
    }

    // Getters e Setters
    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
}