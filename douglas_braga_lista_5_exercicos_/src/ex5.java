import java.util.Scanner;

public class ex5 {
        public static void main(String[] args) {
            int[][] A = new int[5][5];
            int[][] B = new int[5][5];
            int[][] S = new int[5][5];

            Scanner input = new Scanner(System.in);

            System.out.println("Insira os valores para a matriz A:");
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    A[i][j] = input.nextInt();
                }
            }

            System.out.println("Insira os valores para a matriz B:");
            for (int i = 0; i < B.length; i++) {
                for (int j = 0; j < B[i].length; j++) {
                    B[i][j] = input.nextInt();
                }
            }

            for (int i = 0; i < S.length; i++) {
                for (int j = 0; j < S[i].length; j++) {
                    S[i][j] = A[i][j] + B[i][j];
                }
            }

            System.out.println("Matriz S (soma de A e B):");
            for (int i = 0; i < S.length; i++) {
                for (int j = 0; j < S[i].length; j++) {
                    System.out.print(S[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


