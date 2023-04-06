import java.util.Scanner;

public class ex_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, somaPares = 0, somaImpares = 0;

        System.out.print("Digite um número inteiro positivo A: ");
        A = input.nextInt();
        while (A < 0) {
            System.out.print("Digite um número inteiro positivo A: ");
            A = input.nextInt();
        }

        System.out.print("Digite um número inteiro positivo B: ");
        B = input.nextInt();
        while (B < 0) {
            System.out.print("Digite um número inteiro positivo B: ");
            B = input.nextInt();
        }

        // Soma dos pares menores que A
        for (int i = 0; i < A; i += 2) {
            somaPares += i;
        }

        // Soma dos ímpares entre A e B
        for (int i = A + 1; i < B; i += 2) {
            somaImpares += i;
        }

        System.out.println("Soma dos números pares menores que A: " + somaPares);
        System.out.println("Soma dos números ímpares entre A e B: " + somaImpares);
    }
}
