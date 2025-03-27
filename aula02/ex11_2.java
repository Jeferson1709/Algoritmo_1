import java.util.Scanner;

public class ex11_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=======Seja bem-vindo, vamos descobrir sua categoria de acordo com sua idade======");
        System.out.println("Quantos anos você tem??");
        int idade = entrada.nextInt();
        if (idade >= 5 && idade <= 7) {
            System.out.println("Você pertence a categoria: " + "Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Você pertence a categoria: " + "Infantil b");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Você pertence a categoria: " + "juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Você pertence a categoria: " + "juvenil B");
        } else if (idade >= 18) {
            System.out.println("Você pertence a categoria: " + "Sênior");
        }
    }
}
