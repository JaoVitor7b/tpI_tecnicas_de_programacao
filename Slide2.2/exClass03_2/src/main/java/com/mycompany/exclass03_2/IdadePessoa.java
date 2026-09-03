/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exclass03_2;

/**
 *
 * @author fatec-dsm2
 */
public class IdadePessoa {

    private int anoAtual;
    private int ano;
    private int idade;

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public int getAno() {
        return ano;
    }

    public int getIdade() {
        return idade;
    }

    public void calcularIdade() {
        idade = anoAtual - ano;
    }

    public void mostrarIdade() {
        System.out.println("Idade: " + idade);
    }
}
