/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplooo;

/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    public static void main(String[] args) {
       
    //Instanciar OBJETO USU
       Usuario usu = new Usuario();
       
        //Passar dados para classe usuario
        //usu.setNome("Joao Vitor");
        //usu.setIdade(20);
        //usu.setEmail("vitor@gmail.com");
        //usu.setTelefone("(13)997-5594");
       
        //Chamar o Metodo
        usu.cadastrarDados();

       //Chamar metodo Moastrar Dados da Classe Usuario
       usu.MostrarDados();
    }
}
