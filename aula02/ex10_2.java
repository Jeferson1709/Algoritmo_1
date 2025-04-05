import java.util.Scanner;

public class ex10_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero");
        int num2 = entrada.nextInt();
        System.out.println("Digite o terceiro numero");
        int num3 = entrada.nextInt();
        boolean iguais = num1 == num2 && num1 == num3 && num2 == num1 && num2 == num3;
        if (iguais) {
            System.out.println(" Numeros são iguais !");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
        entrada.close();
    }
}
