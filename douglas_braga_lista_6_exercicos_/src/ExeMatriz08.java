import java.util.Scanner;

public class ExeMatriz08 {
    public class Exercicio8 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[][] matriz = new int[10][10];

            System.out.println("Digite os elementos da matriz 10x10:");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    matriz[i][j] = input.nextInt();
                }
            }

            double mediaDiagonalPrincipal = calcularMediaDiagonalPrincipal(matriz);

            System.out.println("A média dos elementos da diagonal principal é: " + mediaDiagonalPrincipal);
        }

        public static double calcularMediaDiagonalPrincipal(int[][] matriz) {
            double soma = 0;
            int count = 0;

            for (int i = 0; i < 10; i++) {
                soma += matriz[i][i];
                count++;
            }

            double media = soma / count;

            return media;
        }
    }

}
