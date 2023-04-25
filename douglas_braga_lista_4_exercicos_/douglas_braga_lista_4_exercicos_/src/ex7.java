import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        int[] x = new int[10];
        int[] y = new int[10];

        Scanner input = new Scanner(System.in);
        System.out.println("Digite os 10 elementos do vetor X: ");

        for (int i = 0; i < 10; i++) {
            x[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                y[i] = x[i] * 2;
            } else {
                y[i] = x[i] * 3;
            }
        }

        System.out.println("Vetor Y: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(y[i] + " ");
        }
    }
}