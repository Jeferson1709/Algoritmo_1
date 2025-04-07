package aula05;

/* 
Faça um algoritmo que receba a Idade e a altura de 10 pessoas:
-calcule e mostre a média das alturas daquelas com mais de 50 anos
*/
import java.util.Scanner;

public class ex4_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        double altura, media = 0, ocorrencia = 0;
        // Loop ajustado para 10 pessoas
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite sua idade: ");
            idade = entrada.nextInt();

            System.out.println("Digite sua altura(em metros): ");
            altura = entrada.nextDouble();
            // Verifica idade maior que 50
            if (idade >= 50) {
                media += altura;
                ocorrencia++;
            }

        }
        // Verifica se houve pessoas com mais de 50 anos antes de calcular a média
        if (ocorrencia > 0) {
            System.out.println("Média das alturas das pessoas com 50 anos é: " + (media / ocorrencia));
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi registrada.");
        }

        entrada.close();
    }
}
