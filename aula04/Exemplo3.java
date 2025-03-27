package aula04;

public class Exemplo3 {
    public static void main(String[] args) {
        int contador, acumulador;
        contador = 1;
        acumulador = 0;
        while (contador < 100) {
            // adiciona o contador ao acumulador
            acumulador = acumulador + contador;
            contador++;// incrementa o contador
        }
        System.out.println("A soma é: " + acumulador);
    }
}
