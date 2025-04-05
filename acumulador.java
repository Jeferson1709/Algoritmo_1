import java.util.Scanner;

public class acumulador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, valorDigitado = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um numero ");
            num = entrada.nextInt();
            valorDigitado += num;
        }
        System.out.println(valorDigitado);
        entrada.close();
    }
}
