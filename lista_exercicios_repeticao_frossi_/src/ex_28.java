import java.util.Scanner;

public class ex_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valores = new int[5];

        // Ler os 5 valores para N
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor de N: ");
            valores[i] = input.nextInt();
        }

        // Mostrar a tabuada para cada valor de N
        for (int i = 0; i < 5; i++) {
            int n = valores[i];
            System.out.println("Tabuada de " + n + ":");
            for (int j = 1; j <= n; j++) {
                System.out.println(j + " x " + n + " = " + (j * n));
            }
            System.out.println(n + " x " + n + " = " + (n * n));
        }
    }
}
