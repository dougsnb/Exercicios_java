import java.util.Scanner;

public class ExeSelecao03 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num1, num2;

            System.out.println("Digite dois números:");
            num1 = input.nextInt();
            num2 = input.nextInt();

            int maior = getMaior(num1, num2);

            System.out.println(maior + " é o maior número.");
        }

        public static int getMaior(int a, int b) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }
    }
