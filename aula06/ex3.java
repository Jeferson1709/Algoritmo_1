package aula06;

import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        // Sorteio dos números e armazenamento no vetor
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10) + 1; // Gera números entre 1 e 10
        }

        // Exibe os números sorteados
        System.out.println("Números sorteados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Encontra o menor número no vetor
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Exibe o menor número
        System.out.println("O menor número é: " + menor);
    }
}
