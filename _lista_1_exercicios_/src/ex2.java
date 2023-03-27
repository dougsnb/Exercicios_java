import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, soma = 0;

        System.out.println("Qual a soma desses números...");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        soma = num1 + num2 + num3;

        System.out.printf("soma dos 3 números= %d\n", num1 + num2 + num3);
    }
}
