import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome, alfa, nacio;
        int idade;
        double cpf, rg;
        System.out.println("Seja bem-vindo, vamos verificar se o Sr ou Sra estão apto(a) votar: ");
        System.out.println("Digite seu nome por favor: ");
        nome = entrada.nextLine();

        System.out.println(nome + " Você foi alfabetizado(n/s): ");
        alfa = entrada.nextLine();

        System.out.println(nome + " Qual é sua nacionalidade?");
        nacio = entrada.nextLine();

        System.out.println(nome + " Qual é sua idade?");
        idade = entrada.nextInt();

        System.out.println(nome + " Digite seu CPF: ");
        cpf = entrada.nextDouble();

        System.out.println(nome + " Digite seu RG: ");
        rg = entrada.nextDouble();

        if ((idade >= 18 && idade <= 70) || (alfa == "s" || alfa == "Sim" || alfa == "sim")
                || (nacio == "Brasileiro" || (nacio == "brasileiro" || nacio == "brasileiro"))) {
            System.out.println(nome + " Terá que votar este ano");
            System.out.println("Eleitor: " + nome + " Idade: " + idade + " CPF: " + cpf + " RG: " + rg);
        }

        else if ((idade < 18) || (idade > 70) || (idade == 16 || idade == 17) || (alfa == "s" || alfa == "Sim"
                || alfa == "sim") ||
                (alfa == "n" || alfa == "Não" || alfa == "não" || alfa == "nao")
                || (nacio == "Brasileiro" || nacio == "brasileiro")) {
            System.out.println("Voto facultativo");
            System.out.println("Eleitor: " + nome + " Idade: " + idade + " CPF: " + cpf + " RG: " + rg);
        }

        else if ((nacio != "Brasileiro" || nacio != "brasileiro")) {
            System.out.println("Estrangeiro");
        }

        else if ((alfa != "s" || alfa != "Sim" || alfa != "sim")
                || (alfa != "n" || alfa != "Não" || alfa != "não" || alfa != "nao")) {
            System.out.println("Opção invalida");
        }
        entrada.close();
    }
}
