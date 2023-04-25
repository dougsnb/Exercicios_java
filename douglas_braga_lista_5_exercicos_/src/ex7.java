import java.util.Scanner;

public class ex7 {
        public static void main(String[] args) {
            int[][] M = new int[5][5];
            int somaLinha4 = 0;
            int somaColuna2 = 0;
            int somaDiagonalPrincipal = 0;
            int somaTotal = 0;

            Scanner input = new Scanner(System.in);

            System.out.println("Insira os valores para a matriz M:");
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    M[i][j] = input.nextInt();
                }
            }

            for (int j = 0; j < M[4].length; j++) {
                somaLinha4 += M[4][j];
            }
            System.out.println("Soma da linha 4 de M: " + somaLinha4);

            for (int i = 0; i < M.length; i++) {
                somaColuna2 += M[i][1];
            }
            System.out.println("Soma da coluna 2 de M: " + somaColuna2);

            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    if (i == j) {
                        somaDiagonalPrincipal += M[i][j];
                    }
                }
            }
            System.out.println("Soma da diagonal principal de M: " + somaDiagonalPrincipal);

            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    somaTotal += M[i][j];
                }
            }
            System.out.println("Soma de todos os elementos de M: " + somaTotal);

            System.out.println("Matriz M:");
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    System.out.print(M[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

