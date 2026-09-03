/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplooo;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Usuario {
    //declaraçã de atributo
    private String nome;
    private int idade;
    private String email;
    private String telefone;
    
    //Encapsulando atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    //Cria Metodo Mostrar Dados
    public void MostrarDados() {
        System.out.println("====Dados do Usuario====");
        System.out.println("Nome Usuario: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Email: " + getEmail() + "\n" + 
                    "Telefone"+ getTelefone() + "\n");
    }
    
    //Criar metodo de Cadastro do Usuario
    public void cadastrarDados(){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o Nome do Usuario");
        setNome(leia.next());
        System.out.println("Digite a Idade");
        setIdade(leia.nextInt());
        System.out.println("Digite o Email");
        setEmail(leia.next());
        System.out.println("Digite o Telefone");
        setTelefone(leia.next());
    }
    
}
