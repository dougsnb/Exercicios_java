import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] M = new int[10];

        System.out.println("Digite os 10 elementos do vetor:");
        for (int i = 0; i < 10; i++) {
            M[i] = input.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int temp = M[i];
            M[i] = M[i + 5];
            M[i + 5] = temp;
        }

        System.out.println("Vetor modificado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(M[i] + " ");
        }
    }
}