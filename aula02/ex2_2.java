import java.util.Scanner;

public class ex2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é sua idade ?");
        int ida = input.nextInt();
        if (ida >= 18) {
            System.out.println("É maior de idade!");
        } else {
            System.out.println(" Menor de idade!");
        }
    }

}
