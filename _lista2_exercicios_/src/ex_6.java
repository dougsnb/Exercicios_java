import java.util.Arrays;
import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("DIGITE 3 NUMEROS");
        num1 = imput.nextInt();
        num2 = imput.nextInt();
        num3 = imput.nextInt();

        if ((num1 < num2 + num3) && (num2 < num1 + num3) && (num3 < num1 + num2)) {
            System.out.println("FORMA UM TRIANGULO");
        } else {
            System.out.println("NÃO FORMA UM TRIANGULO");
        }
    }
}
