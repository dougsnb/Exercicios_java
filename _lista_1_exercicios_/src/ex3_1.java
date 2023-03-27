import java.util.Arrays;
import java.util.Scanner;

public class ex3_1 {
    public static void main(String[] args) {
        Scanner imput= new Scanner(System.in);

        float num1, num2,num3,num4, soma;

        System.out.println("Qual a média aritmetica dos seguintes números?");
        num1= imput.nextFloat();
        num2= imput.nextFloat();
        num3= imput.nextFloat();
        num4= imput.nextFloat();

        soma = num1+num2+num3+num4;
        System.out.println("a soma dos 4 números é "+ soma);
        System.out.println("a média aritmetica é "+ soma/4);

    }
}
