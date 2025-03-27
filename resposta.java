import java.util.Scanner;

public class resposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta = "";
        System.out.println(Math.random());
        int time = 20;
        String result;
        result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        while (!resposta.equals("sair")) { // Enquanto a resposta não for "sair"
            System.out.print("Digite algo (ou 'sair' para finalizar): ");
            resposta = scanner.nextLine();
            System.out.println("Você digitou: " + resposta);
        }

        System.out.println("Programa encerrado!");
        scanner.close();
    }
}
