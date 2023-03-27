import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int num1, num2,num3,num4, soma,media;


        System.out.println("Qual a média destes números?");
        num1= input.nextInt();
        num2= input.nextInt();
        num3= input.nextInt();
        num4= input.nextInt();

        soma = num1+ num2+num3+num4;

        System.out.printf("a soma é: %d\n", soma);
        System.out.printf("a media aritimetica é: %d\n", soma / 4);






    }

}
