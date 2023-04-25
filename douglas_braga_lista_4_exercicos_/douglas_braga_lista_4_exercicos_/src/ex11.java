import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = 20;
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite o %d elemento do vetor: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("\nVetor ordenado em ordem crescente:");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("%d ", vetor[i]);
        }

        sc.close();
    }
}