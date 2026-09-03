/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exclass03;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Passageiros {
    
    private String nomePassageiro;
    private String Telefone;
    private String Rg;
    private String localViagem;
    private String data;
    private String horario;
    private String numPoltrona;

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumPoltrona() {
        return numPoltrona;
    }

    public void setNumPoltrona(String numPoltrona) {
        this.numPoltrona = numPoltrona;
    }
    
    public void cadadstrarCliente(String rg){
    setNomePassageiro(JOptionPane.showInputDialog("Digite o Nome:"));
    setTelefone(JOptionPane.showInputDialog("Digite o Telefone:"));
    setRg(JOptionPane.showInputDialog("Digite o Rg:"));
    setLocalViagem(JOptionPane.showInputDialog("Digite o Destino:"));
    setData(JOptionPane.showInputDialog("Digite o Data:"));
    setHorario(JOptionPane.showInputDialog("Digite o Horario:"));
    setNumPoltrona(JOptionPane.showInputDialog("Digite o Numero da Poltrona:"));
    }
        public String listarCliente(){
        return "Nome: " + getNomePassageiro()+
        "\n Telefone" + getTelefone() +
        "\n Rg: " + getRg() +
        "\n Destino:" + getLocalViagem()+
        "\n Data" + getData() +
        "\n Horario: " + getHorario() +
        "\n Numero da Poltrona :" + getNumPoltrona();
    }
}
