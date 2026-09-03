/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loja;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Loja {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double totalCompra = 0;

        for (int i = 1; i <= 3; i++) {
            leia.nextLine();
            System.out.print("Digite o nome do produto " + i + ": ");
            String nomeProd = leia.nextLine();

            System.out.print("Digite o valor unitário: ");
            double valor = leia.nextDouble();

            System.out.print("Digite a quantidade: ");
            int qtd = leia.nextInt();

            double valorProduto = valor * qtd;
            totalCompra += valorProduto;

            System.out.printf("%s -> R$ %.2f%n", nomeProd, valorProduto);
        }

        System.out.printf("Valor total da compra: R$ %.2f%n", totalCompra);

    }
}
