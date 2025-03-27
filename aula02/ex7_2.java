import java.util.Scanner;

public class ex7_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qunato tempo de empresa você tem?");
        int ano = entrada.nextInt();
        System.out.println("Qual é seu salário ?");
        double salario = entrada.nextDouble();
        double b10 = ((salario) * 0.10);
        double b20 = ((salario) * 0.20);
        if (ano >= 5) {
            System.out.println("Bonus de 20% AO Salário:");
            System.out.println(salario + b20);
        } else {
            System.out.println("Bonus de 10% AO Salário:");
            System.out.println(salario + b10);

        }
    }
}
