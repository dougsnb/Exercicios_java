import java.util.Random;

    public class ExeMatriz02 {
        public static void main(String[] args) {
            int[][] M = gerarMatriz(6, 8, -50, 49);
            System.out.println("Matriz gerada:");
            imprimirMatriz(M);
            int[] C = contarNegativosPorLinha(M);
            System.out.println("Vetor C:");
            imprimirVetor(C);
        }

        public static int[][] gerarMatriz(int linhas, int colunas, int min, int max) {
            Random rand = new Random();
            int[][] M = new int[linhas][colunas];
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    M[i][j] = rand.nextInt(max - min + 1) + min;
                }
            }
            return M;
        }

        public static void imprimirMatriz(int[][] M) {
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    System.out.print(M[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static int[] contarNegativosPorLinha(int[][] M) {
            int[] C = new int[M.length];
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    if (M[i][j] < 0) {
                        C[i]++;
                    }
                }
            }
            return C;
        }

        public static void imprimirVetor(int[] V) {
            for (int i = 0; i < V.length; i++) {
                System.out.println(V[i]);
            }
        }

    }


