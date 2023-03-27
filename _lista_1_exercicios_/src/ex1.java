import java.util.Arrays;
import java.util.Scanner;

public class ex1{
    public static void main(String[] args){
        Scanner soma = new Scanner(System.in);

        int num1, num2, produto;

        System.out.println("A subtração é...");
        num1 = soma.nextInt();
        num2 = soma.nextInt();

        produto = num1 - num2;

        System.out.printf("a multiplicação é: %d\n",produto);

    }
}