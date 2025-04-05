import java.util.Scanner;

public class ex3_3 {
    public static void main(String[] args) {
        Scanner perio = new Scanner(System.in);
        System.out.println("Seja bem-vindo, diga seu periodo");
        System.out.println("Matutino (M)");
        System.out.println("Vespetino (V)");
        System.out.println("Noturno (N)");
        System.out.println("Digite somente a primeira letra do periodo: ");
        char p;
        p = perio.next().charAt(0);
        switch (p) {
            case 'M':
                System.out.println("Bom dia !!");
                break;
            case 'V':
                System.out.println("Boa tarde !!!");
                break;
            case 'N':
                System.out.println("Boa noite !!!");
                break;

            default:
                System.out.println("Opção invalida !!!");
                break;
        }
        perio.close();
    }
}
