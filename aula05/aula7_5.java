package aula05;

import java.util.Scanner;

public class aula7_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int retorno = 10,
                idade,
                ocorrencia50 = 0, pesoMenos40 = 0;
        ;
        double altura, peso, mediaAltura = 0,
                mediaAltura1020 = 0;
        ;
        for (int i = 0; i < retorno; i++) {
            System.out.println("Digite sua idade: ");
            idade = entrada.nextInt();

            System.out.println("Digite sua altura: ");
            altura = entrada.nextDouble();

            System.out.println("Digite sua peso: ");
            peso = entrada.nextDouble();
            if (idade >= 50) {
                ocorrencia50++;

            } else if (idade >= 10 && idade <= 20) {
                mediaAltura1020 += altura;
                mediaAltura++;
            } else if (peso < 40) {
                pesoMenos40++;
            }

        }
        System.out.println("Quantidade de pessoas maiores de 50 anos: " + ocorrencia50);
        System.out.println("Média das alturas das pessoas entre 10 e 20 anos :" + (mediaAltura1020) / mediaAltura);
        System.out.println("Porcentagem de pesoas com peso inferior a 40 quilos: " + (pesoMenos40 / 10) * 100 + "%");

        entrada.close();
    }
}
