
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int X;
        System.out.println("DIGITE UM NÚMERO PARA X:");
        X = Input.nextInt();
        System.out.printf("CONTEUDO DE X É: %d\n", X);
        System.out.printf("O QUADRADO DE X É: %d\n",(X * X));
        System.out.printf("O RESTO DA DIVISÃO DE X POR 3 É: %d\n",(X / 3) );
        System.out.printf("A METADE DE X É: %.1f\n", (float) X / 2);
        System.out.printf("O PRODUTO DE X PELA METADE DE X É: %.1f\n", (float) X * ((float) X / 2 ));

    }
}