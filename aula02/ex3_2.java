import java.util.Scanner;

public class ex3_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=====Digite o primeiro numero=====");
        double num1 = entrada.nextDouble();
        System.out.println("=====Digite o segundo numero=====");
        double num2 = entrada.nextDouble();
        if (num1 == num2) {
            System.out.println("Numeros iguais");
        } else if (num1 > num2) {
            System.out.println("A diferença é: " + (num1 - num2));
        } else {
            System.out.println("A diferença é: " + (num2 - num1));
        }
        entrada.close();
    }
}
