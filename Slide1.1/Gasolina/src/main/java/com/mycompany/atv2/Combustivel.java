/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv2;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Combustivel {
    public static void main(String[] args) {
        // Entrada de dados
        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada de dados
            System.out.print("Digite o número de litros abastecidos: ");
            double litros = scanner.nextDouble();
            
            // Preço fixo da gasolina
            double precoPorLitro = 6.49;
            
            // Cálculo do valor a pagar
            double valorPago = litros * precoPorLitro;
            
            // Saída
            System.out.printf("O valor a ser pago é: R$ %.2f%n", valorPago);
        }
    }
}
