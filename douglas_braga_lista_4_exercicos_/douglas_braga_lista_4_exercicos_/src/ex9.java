import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        int tamanhoVetor = 10;
        int[] vetorA = new int[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];
        int[] vetorC = new int[tamanhoVetor * 2];

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite os " + tamanhoVetor + " elementos do vetor A:");
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorA[i] = leitor.nextInt();
        }

        System.out.println("Digite os " + tamanhoVetor + " elementos do vetor B:");
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorB[i] = leitor.nextInt();
        }

        int indiceC = 0;
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorC[indiceC] = vetorA[i];
            indiceC++;
        }
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorC[indiceC] = vetorB[i];
            indiceC++;
        }

        System.out.println("Vetor resultante C (união de A e B):");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}