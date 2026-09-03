/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv1;

import java.util.Scanner;
/**
 *
 * @author fatec-dsm2
 */

public class ReajusteSalarial {
    public static void main(String[] args) {
        // Entrada de dados
        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada de dados
            System.out.print("Digite o salário atual: ");
            double salario = scanner.nextDouble();
            
            System.out.print("Digite o percentual de reajuste: ");
            double percentual = scanner.nextDouble();
            
            // Cálculo do novo salário
            double novoSalario = salario + (salario * percentual) / 100;
            
            // Saída
            System.out.printf("O novo salário é: %.2f%n", novoSalario);
        }
    }
}
