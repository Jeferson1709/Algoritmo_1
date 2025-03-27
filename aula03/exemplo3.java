// Removed package declaration to match the directory structure

import java.util.Scanner;

public class exemplo3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=========Menu de Opções=========");
        System.out.println("1-Cadrastrar Produtos");
        System.out.println("2-Listar Produtos");
        System.out.println("3-Sair do Sistema ");
        System.out.println("=========Menu de Opções=========");
        int botao;
        botao = entrada.nextInt();
        switch (botao) {
            case 1:
                System.out.println("Qual é o codigo do produto: ");
                break;
            case 2:
                System.out.println("Qual é o produto que você deseja listar: ");
                break;

            case 3:
                System.out.println("Saindo.... ");
                break;

            default:
                System.out.println("Opção invalida ");
                break;
        }
    }

}
