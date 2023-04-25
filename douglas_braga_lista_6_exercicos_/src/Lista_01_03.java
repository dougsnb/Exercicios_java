import java.util.Scanner;

public class Lista_01_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, soma;

        System.out.println("Digite quatro números para calcular a média:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();

        soma = sum(num1, num2, num3, num4);

        System.out.printf("A soma é: %d\n", soma);
        System.out.printf("A média aritmética é: %.2f\n", average(num1, num2, num3, num4));
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static double average(int a, int b, int c, int d) {
        int soma = sum(a, b, c, d);
        return (double) soma / 4;
    }
}

