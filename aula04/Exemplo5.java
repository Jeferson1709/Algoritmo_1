package aula04;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        int opcao = 1;
        System.out.println("Seja bem-vindo");
        while (opcao == 1) {
            System.out.println("Digite seu nome: ");
            nome = entrada.next();

            System.out.println("Digite sua idade: ");
            idade = entrada.nextInt();
            if (idade >= 18) {
                System.out.println("Seu nome eh: " + nome);
            }

            System.out.println("Deseja continuar ?");
            System.out.println("Digite 1 (sim) ou 0 (não)");
            opcao = entrada.nextInt();

        }
    }
}
