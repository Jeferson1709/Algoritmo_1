package e;

import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite um numero:");
            n = teclado.nextInt();
            s += n;// s=s=n;
            System.out.println("Quer Continuar  digite [S ou N]");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos valores é " + s);

        teclado.close();

    }
}
