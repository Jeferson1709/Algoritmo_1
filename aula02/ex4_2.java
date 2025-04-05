import java.util.Scanner;

public class ex4_2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("=====Digite o primeiro numero=====");
        float num1 = ent.nextFloat();
        System.out.println("=====Digite o segundo numero=====");
        float num2 = ent.nextFloat();
        if (num1 > num2) {
            System.out.println("numeros: " + num1 + " , " + num2);
        } else if (num2 > num1) {
            System.out.println("numeros: " + num2 + " , " + num1);
        } else {
            System.out.println("Os numeros não podem ser iguais!");
        }
        ent.close();
    }
}
