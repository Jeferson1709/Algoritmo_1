package aula05;

import java.util.Scanner;

public class ex6_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int canditato1 = 0,
                canditato2 = 0,
                canditato3 = 0,
                canditato4 = 0,
                retorno = 10;
        double votoBranco = 0,
                votoNulo = 0;
        for (int i = 0; i < retorno; i++) {
            System.out.println("Sistema de Votação: ");
            System.out.println("Para candidato 1 digite (1):");
            System.out.println("Para candidato 2 digite (2):");
            System.out.println("Para candidato 3 digite (3):");
            System.out.println("Para candidato 4 digite (4):");
            System.out.println("Para Votar Nulo digite (5):");
            System.out.println("Para votar Em Branco digite (6):");
            String opcao = entrada.nextLine();
            switch (opcao) {
                case "1":
                    canditato1++;
                    break;

                case "2":
                    canditato2++;

                    break;
                case "3":
                    canditato3++;

                    break;
                case "4":
                    canditato4++;
                    break;
                case "5":
                    votoNulo++;
                    break;
                case "6":
                    votoBranco++;
                    break;

                default:
                    System.out.println("Número invalido!!");
                    retorno++;
                    break;
            }
        }
        System.out.println("O total de Votos para o caditato 1: " + canditato1);
        System.out.println("O total de Votos para o caditato 2: " + canditato2);
        System.out.println("O total de Votos para o caditato 3: " + canditato3);
        System.out.println("O total de Votos para o caditato 4: " + canditato4);
        System.out.println("O total de Votos em Branco: " + (int) votoBranco);
        System.out.println("O total de Votos Nulos: " + (int) votoNulo);
        System.out.println(
                "O Percentual dos votos Nulos e  votos em Brancos: " + ((int) ((votoBranco + votoNulo) / 10.0 * 100)));

        entrada.close();
    }
}
