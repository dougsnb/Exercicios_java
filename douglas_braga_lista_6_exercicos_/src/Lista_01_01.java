import java.util.Scanner;

public class Lista_01_01 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            int num1, num2, sub;

            System.out.println("Digite dois números para subtrair:");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            sub = subtracao(num1, num2);

            System.out.printf("O resultado da subtração é: %d\n", sub);
        }

        public static int subtracao(int a, int b) {
            return a - b;
        }
    }

