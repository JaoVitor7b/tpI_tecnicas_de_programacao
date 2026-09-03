/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retangulo;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Retangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o lado B: ");
        double b = scanner.nextDouble();

        double area = a * b;
        double perimetro = 2 * a + 2 * b;

        System.out.printf("Área: %.2f | Perímetro: %.2f%n", area, perimetro);

        scanner.close();
    }
}
