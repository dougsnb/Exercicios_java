import java.util.Scanner;

public class ExeVetor05 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        Scanner input = new Scanner(System.in);

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 10; i++) {
            A[i] = input.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < 10; i++) {
            B[i] = input.nextInt();
        }

        C = multiplicarVetores(A, B);

        System.out.println("O vetor resultante (C) é:");
        for (int i = 0; i < 10; i++) {
            System.out.print(C[i] + " ");
        }
    }

    public static int[] multiplicarVetores(int[] A, int[] B) {
        int[] C = new int[10];

        for (int i = 0; i < 10; i++) {
            C[i] = A[i] * B[i];
        }

        return C;
    }

}
