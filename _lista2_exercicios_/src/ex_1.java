import java.util.Arrays;
import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int numero = 100;

        System.out.println("DIGITE UM NUMERO");
        numero = imput.nextInt();

        if (numero > 100) {
            System.out.println("ESTE NUMERO É MAIOR QUE 100");
        }
        else if (numero <= 100) {
            System.out.println("ESTE NUMERO É MENOR QUE 100");
        }

    }
}
