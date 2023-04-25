import java.util.Random;

public class ex2 {
        public static void main(String[] args) {
            int[][] M = new int[6][8];
            Random rand = new Random();

            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    M[i][j] = rand.nextInt(100) - 50; // gerando um número aleatório entre -50 e 49
                }
            }

            System.out.println("Matriz gerada:");
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    System.out.print(M[i][j] + " ");
                }
                System.out.println();
            }

            int[] C = new int[M.length];
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    if (M[i][j] < 0) {
                        C[i]++;
                    }
                }
            }

            System.out.println("Vetor C:");
            for (int i = 0; i < C.length; i++) {
                System.out.println(C[i]);
            }
        }
    }


