import java.util.Random;

public class ex4 {
        public static void main(String[] args) {
            int[][] matriz = new int[10][10];
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

            int somaLinhasPares = 0;
            for (int i = 1; i < matriz.length; i += 2) {
                for (int j = 0; j < matriz[i].length; j++) {
                    somaLinhasPares += matriz[i][j];
                }
            }
            System.out.println("Soma das linhas pares da matriz: " + somaLinhasPares);
        }
    }

