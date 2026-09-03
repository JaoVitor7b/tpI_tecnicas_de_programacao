/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.produto;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Produto {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        leia.nextLine();
        System.out.print("Digite o nome do produto: ");
        String nome = leia.nextLine();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = leia.nextInt();

        System.out.print("Digite o preço unitário: ");
        double precoUnitario = leia.nextDouble();

        double total = quantidade * precoUnitario;

        System.out.printf("Produto: %s%nTotal a pagar: R$ %.2f%n", nome, total);

        leia.close();
    }
}
