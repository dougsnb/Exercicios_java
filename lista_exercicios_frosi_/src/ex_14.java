import java.util.Scanner;

public class ex_14 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int num1;

        System.out.println("DIGITE UM NUMERO");
        num1 = imput.nextInt();

        if (num1 % 2 == 0) {

            System.out.println("É PAR");
        } else {
            System.out.println("É IMPAR");
        }
    }
}
