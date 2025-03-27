import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem-vindo ao jogo de adivinha, digite um numero:");
        int num = entrada.nextInt();
        if (num == 15) {
            System.out.println("Parabens você acertou");
        } else if (num > 15) {
            System.out.println("O seu palpite está um pouco acima");
        } else {
            System.out.println("Seu palpite está muito abaixo");
        }
    }
}
