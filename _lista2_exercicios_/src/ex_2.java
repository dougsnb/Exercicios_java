import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int num, par, impar;

        System.out.println("DIGITE UM NUMERO");
        num = imput.nextInt();

        if (num %2 == 0) {
            System.out.println("ESTE NUMERO É PAR");
        }
        else {
            System.out.println("ESTE NUMERO É IMPAR");
        }

    }
}
