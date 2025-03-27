package aula04;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, par = 0, impar = 0, i;// declarando a variavel
        i = 1; // declarando o contador

        while (i <= 10) {// enquanto o valor do contador for menor que 10 vai continuar rodando
            System.out.println("Digite o " + i + "º numero");
            num = entrada.nextInt();// entrada do usuario
            i++;// incremento i + 1
            if (num % 2 == 0) { // se o resto da divisão do numero digitado por 2 tiver o resto zero é um numero

                System.out.println("É par: " + num);
                par++; // par
            } else {
                System.out.println("É impar: " + num);
                impar++;
            }

        }
        System.out.println("O total de Pares: " + par);
        System.out.println("O total de Impares: " + impar);
        entrada.close();
    }
}