import java.util.Random;

public class ex3 {
        public static void main(String[] args) {
            int[][] matriz = new int[5][5];
            Random rand = new Random();

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = rand.nextInt(100) + 1;
                }
            }

            System.out.println("Matriz gerada:");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            int[] somaColunas = new int[matriz[0].length];
            for (int j = 0; j < matriz[0].length; j++) {
                for (int i = 0; i < matriz.length; i++) {
                    somaColunas[j] += matriz[i][j];
                }
                System.out.println("Soma da coluna " + (j+1) + ": " + somaColunas[j]);
            }
        }
    }

