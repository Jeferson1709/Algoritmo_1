import java.util.Scanner;

public class ex5_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double media;
        int dif, prod, div, num1, num2;
        char opcao;
        System.out.println("Seja bem-vindo, digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();

        System.out.println("=====Opção====Mensagem====");
        System.out.println("(M) média");
        System.out.println("(D) Divisão");
        System.out.println("(S) Diferença");
        opcao = entrada.next().charAt(0);
        System.out.println("(P) Produto");

        switch (opcao) {
            case 'M':
                System.out.println("Números escolhidos: " + num1 + ", " + num2);
                System.out.println("Média: " + (num1 + num2) / 2);
                break;
            case 'S':
                System.out.println("Números escolhidos: " + num1 + ", " + num2);

                if (num1 > num2) {
                    System.out.println("Subtração: " + (num1 - num2));
                } else if (num2 > num1) {
                    System.out.println("Subtração: " + (num2 - num1));
                }

                break;
            case 'P':
                System.out.println("Números escolhidos: " + num1 + ", " + num2);
                System.out.println("Produto: " + (num1 * num2));

                break;
            case 'D':
                System.out.println("Números escolhidos: " + num1 + ", " + num2);
                System.out.println("Divisão: " + (num1 / num2));

                break;

            default:
                System.out.println("Opção invalida");
                break;
        }

    }
}
