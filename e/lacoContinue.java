package e;

public class lacoContinue {
    public static void main(String[] args) {
        int cc = 0;// contador
        while (cc < 10) {// codição while enquanto um numero for menor que dez
            cc++;// imcremento
            if (cc == 5 || cc == 7 || cc == 9) {// se o contador for 5 ou 7 ou 9 vai voltar para repetição
                continue;// volta para repetição
            }
            System.out.println("canbolhota " + cc);// cabalhota + numero dela
        }
    }
}
