import java.util.Scanner;

public class ExeVetor13 {
    public static void main(String[] args) {
        int[] x = new int[10];
        int[] y = new int[10];

        Scanner input = new Scanner(System.in);
        System.out.println("Digite os 10 elementos do vetor X: ");

        for (int i = 0; i < 10; i++) {
            x[i] = input.nextInt();
        }

        y = calculaVetorY(x);

        System.out.println("Vetor Y: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(y[i] + " ");
        }
    }

    public static int[] calculaVetorY(int[] x) {
        int[] y = new int[10];

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                y[i] = x[i] * 2;
            } else {
                y[i] = x[i] * 3;
            }
        }

        return y;
    }

}
