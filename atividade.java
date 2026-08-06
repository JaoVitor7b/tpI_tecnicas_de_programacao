package tpi;

import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        double resultado, media, media2, nota1, nota2, nota3, nota4, nota5, nota6;

        Scanner leia = new Scanner(System.in);
        System.out.println("(Digite a primeira nota)");
        nota1 = leia.nextDouble();
        System.out.println("Digite a segunda nota");
        nota2 = leia.nextDouble();
        System.out.println("Digite a terceira nota");
        nota3 = leia.nextDouble();
        System.err.println("Digite a quarta nota");
        nota4 = leia.nextDouble();
        System.err.println("Digite a quinta nota");
        nota5 = leia.nextDouble();
        System.err.println("Digite a sexta nota");
        nota6 = leia.nextDouble();
        media = (nota1 + nota2 + nota3)/3;
        media2 = (nota4 + nota5 + nota6)/3;
        resultado = (media + media2)/2;
        System.out.println("Sua media é " + resultado);

    }
}
