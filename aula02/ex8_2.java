import java.util.Scanner;

public class ex8_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Usuário por favor:");
        String nome = entrada.nextLine();
        System.out.println("Senha por favor ");
        String senha = entrada.next();
        if (senha.equals("R10p5")) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
