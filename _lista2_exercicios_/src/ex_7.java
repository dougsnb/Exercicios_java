import java.util.Arrays;
import java.util.Scanner;

public class ex_7 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("DIGITE O PRIMEIRO NUMERO");
        num1 = imput.nextInt();
        System.out.println("DIGITE O SEGUNDO NUMERO");
        num2 = imput.nextInt();
        System.out.println("DIGITE O TERCEIRO NUMERO");
        num3 = imput.nextInt();

        if ((num1 < num2) && (num2 < num3)) {
            System.out.println("A ORDEM CRESCENTE É:" + num1 + "\t" + num2 + "\t" + num3);
        }
        if ((num2 < num1) && (num1 < num3)) {
            System.out.println("A ORDEM CRESCENTE É:" + num2 + "\t" + num1 + "\t" + num3);
        }
        if ((num3 < num2) && (num2 < num1)) {
            System.out.println("A ORDEM CRESCENTE É:" + num3 + "\t" + num2 + "\t" + num1);
        }
        if ((num3 < num1) && (num1 < num2)) {
            System.out.println("A ORDEM CRESCENTE É:" + num3 + "\t" + num1 + "\t" + num2);
        }
        if ((num1 < num3) && (num3 < num2)) {
            System.out.println("A ORDEM CRESCENTE É:" + num1 + "\t" + num3 + "\t" + num2);
        }
        if ((num2 < num3) && (num3 < num1)) {
            System.out.println("A ORDEM CRESCENTE É:" + num2 + "\t" + num3 + "\t" + num1);
        }
    }
}