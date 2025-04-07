package aula05;

/*
 Faça um algortimo que receba notas de 6 alunos, calcule e mostre:
 a) A média aritmetica das duas notas de cada aluno; 
 b) Forneça a seguinte mensagem de acordo com a nota;
 -REPROVADO se média é menor ou igual a 3.
 -EXAME se média é acima de 3 e menor.
 -APROVADO maior ou igual a 7.
 c) 
  */
import java.util.Scanner;

public class ex5_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1 = 0, nota2 = 0, mediaAritmetica = 0, mediaClasse = 0;
        int aprovados = 0, reprovados = 0, exames = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite sua primeira nota: ");
            nota1 = entrada.nextDouble();

            System.out.println("Digite sua segunda nota: ");
            nota2 = entrada.nextDouble();
            mediaAritmetica = (nota1 + nota2) / 2;
            if (mediaAritmetica >= 3 && mediaAritmetica < 7) {

                System.out.println("Sua nota é: " + mediaAritmetica + " EXAME");
                exames++;
            } else if (mediaAritmetica >= 7) {
                System.out.println("Sua nota é: " + mediaAritmetica + " APROVADO");
                aprovados++;
            }

            else if (mediaAritmetica <= 3) {
                System.out.println("Sua nota é: " + mediaAritmetica + " REPROVADO");
                reprovados++;
            }
            mediaClasse += mediaAritmetica;
        }
        System.out.println("O total de alunos aprovados: " + aprovados);
        System.out.println("O totlal de alunos reprovados :" + reprovados);
        System.out.println("O total de alunnos de exame: " + exames);
        System.out.println("A média da classe " + mediaClasse);
        entrada.close();
    }
}
