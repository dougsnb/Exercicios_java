import java.util.Random;

public class ExeMatriz01 {
        public static void main(String[] args) {
            int[][] matriz = gerarMatriz(7, 9);
            imprimirMatriz(matriz);
            int soma = calcularSoma(matriz);
            System.out.println("Soma dos elementos da matriz: " + soma);
        }

        public static int[][] gerarMatriz(int linhas, int colunas) {
            int[][] matriz = new int[linhas][colunas];
            Random rand = new Random();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = rand.nextInt(100);
                }
            }
            return matriz;
        }

        public static void imprimirMatriz(int[][] matriz) {
            System.out.println("Matriz gerada:");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static int calcularSoma(int[][] matriz) {
            int soma = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    soma += matriz[i][j];
                }
            }
            return soma;
        }
    }


