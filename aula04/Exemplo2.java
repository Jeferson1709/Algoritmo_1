package aula04;

public class Exemplo2 {
    public static void main(String[] args) {
        int contador, resto;
        contador = 0;
        while (contador <= 10) {
            resto = contador % 2;
            if (resto == 0) {

                System.out.println("Pares: " + contador);
            }
            contador++;
        }
    }
}
