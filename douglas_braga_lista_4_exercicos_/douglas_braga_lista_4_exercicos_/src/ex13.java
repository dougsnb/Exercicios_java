import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        int[] vetorA = new int[30];
        int[] vetorB = new int[30];
        int[] vetorC = new int[30];
        int posicaoC = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = input.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = input.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[i] == vetorB[j]) {
                    vetorC[posicaoC] = vetorA[i];
                    posicaoC++;
                    break;
                }
            }
        }

        System.out.println("Interseccao dos vetores A e B:");
        for (int i = 0; i < posicaoC; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}