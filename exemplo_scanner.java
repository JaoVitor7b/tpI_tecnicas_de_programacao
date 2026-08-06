package tpi;

import java.util.Scanner;

public class exemplo_scanner {
    public static void main(String[] args) {

        // Declaração de variavei
        int soma, sub, mult, num1, num2;
        double div;

        // Comando para leitura de dados pelo teclado
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero");
        num1 = leia.nextInt();
        System.out.println("Digite o segundo numero");
        num2 = leia.nextInt();
        soma = num1 + num2;
        sub = num1 - num2;
        div = num1 / num2;
        mult = num1 * num2;
        System.err.println("O resultado da sua soma é " + soma);
        System.out.println("O resultado da sua subtração é " + sub);
        System.out.println("O resultado da sua divisao é " + div);
        System.err.println("O resultado da sua multiplicação é " + mult);
    
    }
}