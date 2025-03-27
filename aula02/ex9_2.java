import java.util.Scanner;

public class ex9_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é o valor do emprétismo");
        Double empre = entrada.nextDouble();
        System.out.println("Qual é seu salário");
        Double sala = entrada.nextDouble();
        Double prestacao = sala * 0.30;
        if (empre < prestacao) {
            System.out.println("Empretismo pode ser concedido");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");

        }
    }
}
