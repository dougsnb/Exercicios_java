import java.util.Random;

public class ex1 {
        public static void main(String[] args) {
            int[][] matriz = new int[7][9];
            Random rand = new Random();

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = rand.nextInt(100);
                }
            }

            System.out.println("Matriz gerada:");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            int soma = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    soma += matriz[i][j];
                }
            }

            System.out.println("Soma dos elementos da matriz: " + soma);
        }
    }

