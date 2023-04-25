import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        int[] pares = new int[10];
        int[] impares = new int[10];

        int idxPares = 0;
        int idxImpares = 0;

        Scanner entrada = new Scanner(System.in);
        int numero = -1;
        while (numero != 0 && idxPares < 10 && idxImpares < 10) {
            System.out.print("Digite um número inteiro (ou 0 para sair): ");
            numero = entrada.nextInt();

            if (numero % 2 == 0 && idxPares < 10) {
                pares[idxPares] = numero;
                idxPares++;
            } else if (idxImpares < 10) {
                impares[idxImpares] = numero;
                idxImpares++;
            }
        }

        System.out.println("Vetor de pares:");
        for (int i = 0; i < idxPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor de ímpares:");
        for (int i = 0; i < idxImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();

    }

}