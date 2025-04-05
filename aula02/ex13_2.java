import java.util.Scanner;

public class ex13_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double soma, sub, mul, div;
        double num1, num2;
        System.out.println("Escolha a operação:  ");
        System.out.println("Soma(+)");
        System.out.println("Subtração(-)");
        System.out.println("Multiplicação(*)");
        System.out.println("Divisão(/)");
        char ope = entrada.next().charAt(0);
        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextDouble();

        if (ope == '+') {
            System.out.println("Numeros escolhidos: " + num1 + " , " + num2);
            System.out.println("Soma:" + (num1 + num2));
        } else if (num1 == 0 || num2 == 0) {
            System.out.println("Impossivel de dividir!!");
        }

        else if (ope == '-') {

            System.out.println("Numeros escolhidos: " + num1 + " , " + num2);
            System.out.println("Subtração:" + (num1 - num2));
        } else if (ope == '*') {
            System.out.println("Numeros escolhidos: " + num1 + " , " + num2);
            System.out.println("Multiplicação: " + (num1 * num2));
        } else if (ope == '/' && num1 > 0) {
            System.out.println("Numeros escolhidos: " + num1 + " , " + num2);
            System.out.println("Divisão: " + (num1 / num2));

        } else {
            System.out.println("Sinal invalido ");
        }
        entrada.close();
    }
}
