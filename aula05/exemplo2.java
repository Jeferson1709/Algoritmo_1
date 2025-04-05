package aula05;

import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade, acumulador = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite uma idade:");
            idade = entrada.nextInt();
            acumulador += idade;
        }
        System.out.println("A soma das idades é: " + acumulador);
        entrada.close();

    }
}
