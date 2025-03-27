import java.util.Scanner;

public class ex4_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char plano;
        double salario, desc10, desc15, desc20;

        System.out.println("Seja bem-vindo, Qual é seu plano de trabalho: ");
        System.out.println("(A)");
        System.out.println("(B)");
        System.out.println("(C)");
        plano = entrada.next().charAt(0);
        System.out.println("Qual é seu salário ? ");
        salario = entrada.nextDouble();
        desc10 = salario * 0.10;
        desc15 = salario * 0.15;
        desc20 = salario * 0.20;

        switch (plano) {
            case 'A':
                System.out.println("Você teve um desconto de 10%: " + " R$" + desc10);
                break;
            case 'B':
                System.out.println("Você teve um desconto de 15%: " + " R$" + desc15);
                break;
            case 'C':
                System.out.println("Você teve um desconto de 20%: " + " R$" + desc20);
                break;

            default:
                System.out.println("Opção invalida !!!!!");
                break;
        }
    }
}
