import java.util.Scanner;

public class ex_16 {
        public static void main(String[] args) {
            Scanner Imput = new Scanner(System.in);

            int num1, num2;
            do {
                System.out.print("Digite o primeiro número: ");
                num1 = Imput.nextInt();

                System.out.print("Digite o segundo número: ");
                num2 = Imput.nextInt();

                if (num1 < num2) {
                    System.out.println("A dupla foi informada em ordem crescente.");
                } else if (num1 > num2) {
                    System.out.println("A dupla foi informada em ordem decrescente.");
                }
            } while (num1 != num2);

            Imput.close();
        }
    }


