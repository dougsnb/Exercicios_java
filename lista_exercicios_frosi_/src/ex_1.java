import java.util.Arrays;
import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int  valor = 0;

        System.out.println("DIGITE UM NÚMERO");
            valor = imput.nextInt();

    if (valor >= 0){
        System.out.println("O NÚMERO "+ valor + " É POSTIVO");}
    else
        System.out.println("O NÚMERO "+ valor + " É NEGATIVO");

    }
}