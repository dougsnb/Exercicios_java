import java.util.Scanner;
    public class ex8 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[][] matriz = new int[10][10];
            double soma = 0;
            int count = 0;

            System.out.println("Digite os elementos da matriz 10x10:");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    matriz[i][j] = input.nextInt();
                }
            }

            for (int i = 0; i < 10; i++) {
                soma += matriz[i][i];
                count++;
            }

            double media = soma / count;

            System.out.println("A média dos elementos da diagonal principal é: " + media);
        }
    }


