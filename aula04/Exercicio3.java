package aula04;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite = 1024;
        int i = 1;
        while (i <= limite) {
            System.out.println(i);
            i *= 2;

        }
    }
}
