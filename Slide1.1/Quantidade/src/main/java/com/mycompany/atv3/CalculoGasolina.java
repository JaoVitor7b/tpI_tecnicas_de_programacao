/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 */

package com.mycompany.atv3;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class CalculoGasolina {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.nextLine(); // limpar buffer
            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite a quantidade comprada: ");
            int quantidade = scanner.nextInt();
            
            System.out.print("Digite o preço unitário: ");
            double precoUnitario = scanner.nextDouble();
            
            double total = quantidade * precoUnitario;
            
            System.out.printf("Produto: %s%nTotal a pagar: R$ %.2f%n", nome, total);
        }
    }
}
