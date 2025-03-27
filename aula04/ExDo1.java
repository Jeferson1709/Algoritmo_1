package aula04;

import java.util.Scanner;

public class ExDo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        do {
            System.out.println("Digite uma nota");
            nota = entrada.nextInt();

        } while (nota < 0 || nota > 10);
        // while (!(nota >= 0 && nota <= 10));
        System.out.println("Nota Correta!");
    }
}
