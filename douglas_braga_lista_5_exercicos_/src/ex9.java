import java.util.Scanner;
    public class ex9 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[][] matriz = new int[3][3];
            double soma = 0;
            int count = 0;

            System.out.println("Digite os elementos da matriz 3x3:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz[i][j] = input.nextInt();
                }
            }

            for (int i = 0; i < 3; i++) {
                soma += matriz[i][2 - i];
                count++;
            }
            double media = soma / count;

            for (int i = 0; i < 3; i++) {
                matriz[i][i] *= media;
            }

            System.out.println("Matriz resultante:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


