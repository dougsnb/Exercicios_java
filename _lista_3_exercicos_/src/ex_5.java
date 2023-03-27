import java.util.Scanner;

public class ex_5 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        int num;

        do {

            System.out.println("Digite um número inteiro.");
            num = imput.nextInt();

            for (int contador = 1; contador <= 10; contador++) {
                System.out.printf("%d x %d = %d\n", num, contador, contador * num);
            }

        }while (num <= 0);

        System.out.println("Número negativo. Programa encerrado.");

    }
}