package aula04;

import java.util.Scanner;

public class notaAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        int nota;
        i = 0;
        System.out.println(" Digite a nota do aluno");
        nota = entrada.nextInt();
        while (i < 10) {
            System.out.println(" Digite a nota do aluno" + i);
            nota = entrada.nextInt();
            i++;
        }
        entrada.close();
    }
}
