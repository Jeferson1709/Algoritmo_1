
import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é sua pontuação entre? ");
        int pont = input.nextInt();
        if (pont >= 1000) {
            System.out.println("Passou para fase 2");

        } else {
            System.out.println("necessário mais pontos");
        }
        input.close();
    }
}
