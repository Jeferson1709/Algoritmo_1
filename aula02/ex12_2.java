import java.util.Scanner;

public class ex12_2 {
    public static void main(String[] args) {
        Scanner entranda = new Scanner(System.in);
        System.out.println("======= Olá seja bem-vindo,  informe seu salário para saber seu desconto do INNS: ======");
        double salario = entranda.nextDouble();
        double desc30, desc25, desc20;
        desc30 = salario * 0.30;
        desc25 = salario * 0.25;
        desc20 = salario * 0.20;
        if ((salario > 1200) && (salario <= 2000)) {
            System.out.println("Seu salario é de: " + salario);
            System.out.println("Você teve um desconto de 25%: " + desc25);
        } else if (salario > 600 && salario <= 1200) {

            System.out.println("Seu salario é de: " + salario);
            System.out.println("Você teve um desconto de 20%: " + desc20);
        } else if (salario >= 2000) {
            System.out.println("Seu salario é de: " + salario);
            System.out.println("Você teve um desconto de 30%: " + desc30);

        } else if (salario <= 600) {
            System.out.println("Seu salario é de: " + salario);
            System.out.println("Você está insento de desconto!");
        }

    }
}
