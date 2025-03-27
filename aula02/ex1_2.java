import java.util.Scanner;;

public class ex1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = input.nextInt();
        int metade = num / 2;
        if (num > 20) {
            System.out.println("A metade é:" + metade);
        } else {

            System.out.println("seu numero é: " + num);
        }
    }
}
