import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int num1, num2;

        System.out.println("DIGITE DOIS NUMEROS");
        num1 = imput.nextInt();
        num2 = imput.nextInt();

        if (num1 > num2) {
            System.out.println( num1 + " É MAIOR ");
        }
        else if (num2 > num1 ) {
            System.out.println( num2 + " É MAIOR ");
        }

    }
}
