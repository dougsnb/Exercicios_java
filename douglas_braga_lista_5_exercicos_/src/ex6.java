import java.util.Scanner;

public class ex6 {
        public static void main(String[] args) {
            int[][] M = new int[6][6];
            int[] V = new int[36];

            Scanner input = new Scanner(System.in);

            System.out.println("Insira os valores para a matriz M:");
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    M[i][j] = input.nextInt();
                }
            }

            System.out.print("Insira um valor A para multiplicar a matriz M: ");
            int A = input.nextInt();

            int index = 0;
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    V[index] = M[i][j] * A;
                    index++;
                }
            }

            System.out.println("Vetor V com os valores resultantes:");
            for (int i = 0; i < V.length; i++) {
                System.out.print(V[i] + " ");
            }
        }
    }


