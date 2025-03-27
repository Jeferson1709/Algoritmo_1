package e;

public class lacoBreaj {
    public static void main(String[] args) {
        int cc = 0;// contador
        while (cc < 10) {// codição while enquanto um numero for menor que dez
            cc++;// imcremento
            if (cc == 2 || cc == 3 || cc == 4) {// se o contador for 5 ou 7 ou 9 vai voltar para repetição
                continue;// volta para repetição
            }
            if (cc == 7) {
                break;// faz interrupção
            }
            System.out.println("canbolhota " + cc);// cabalhota + numero dela
        }
    }
}
