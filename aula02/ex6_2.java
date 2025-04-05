import java.util.Scanner;

public class ex6_2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Calculo do peso ideal");
        System.out.println("Para masculino digite m ou f para feminio:");
        String sexo = ent.nextLine();
        System.out.println("Qual é seu peso ?");
        double peso = ent.nextDouble();
        System.out.println("Qual é sua altura ?");
        double altura = ent.nextDouble();
        if (sexo.equals("m")) {
            System.out.println(peso / Math.pow(altura, 2));
        } else if (sexo.equals("m")) {
            System.out.println(peso / Math.pow(altura, 2));
        }
        ent.close();
    }
}
