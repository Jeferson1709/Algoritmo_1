package aula05;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        System.out.println("Numero escolhido: " + num);
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        entrada.close();
    }
}
