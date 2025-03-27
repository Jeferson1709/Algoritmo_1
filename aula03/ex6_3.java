import java.util.Scanner;

public class ex6_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cod;

        System.out.println("==Código====Produto=======Preço====");
        System.out.println("---100  Chachorro Quente  R$ 1,20");
        System.out.println("---101  Bauru Simple      R$ 1,30");
        System.out.println("---102  Buaru com ovo     R$ 1,50");
        System.out.println("---103  Hambúguer         R$ 1,20");
        System.out.println("---104  Cheeseburguer     R$ 1,30");
        System.out.println("---105  Refrigerante      R$ 1,00");
        System.out.println("---106  Fechar Compra            ");
        cod = entrada.nextInt();

        switch (cod) {
            case 100:
                System.out.println("---100  Chachorro Quente  R$ 1,20");
                System.out.println("Total: R$ " + 1.20);
                break;
            case 101:
                System.out.println("---101  Bauru Simple      R$ 1,30");
                System.out.println("Total: R$ " + 1.30);
                break;
            case 102:
                System.out.println("---102  Buaru com ovo     R$ 1,50");
                System.out.println("Total: R$ " + 1.50);
                break;
            case 103:
                System.out.println("---103  Hambúguer         R$ 1,20");
                System.out.println("Total: R$v" + 1.20);
                break;
            case 104:
                System.out.println("---104  Cheeseburguer     R$ 1,30");
                System.out.println("Total: R$v" + 1.30);
                break;
            case 105:
                System.out.println("---105  Refrigerante      R$ 1,00");
                System.out.println("Total: R$v" + 1.00);
                break;

            default:
                System.out.println("Compra finalizada");
                break;
        }

    }

}