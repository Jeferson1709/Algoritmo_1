package aula04;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        System.out.println("Digite a sua idade");
        idade = entrada.nextInt();
        if (idade >= 18) {
            System.out.println(" Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
        entrada.close();
    }
}
