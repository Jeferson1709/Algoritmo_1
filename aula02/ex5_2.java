import java.util.Scanner;

public class ex5_2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("###### digite um numero ######");
        int num = ent.nextInt();
        if (num >= 50 && num <= 100) {
            System.out.println("pertence ao intervalo");
        } else {
            System.out.println("Não pertence ao intervalo");
        }
        ent.close();
    }
}
