package aula04;

import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        int contador;
        double nota, media, acumuladorNotas;
        contador = 0;
        acumuladorNotas = 0;
        Scanner entrada = new Scanner(System.in);
        while (contador < 5) {
            contador++;
            System.out.println("Digite um nota: " + contador);
            nota = entrada.nextDouble();
            acumuladorNotas = acumuladorNotas + nota;
        }
        media = acumuladorNotas / contador;
        System.out.println("Média: " + media);
        entrada.close();
    }
}