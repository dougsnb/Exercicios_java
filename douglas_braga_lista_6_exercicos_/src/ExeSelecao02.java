import java.util.Scanner;

public class ExeSelecao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Digite um número:");
        num = input.nextInt();

        if (isEven(num)) {
            System.out.println("Este número é par");
        } else {
            System.out.println("Este número é ímpar");
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

