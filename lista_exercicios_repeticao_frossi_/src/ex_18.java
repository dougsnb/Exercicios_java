import java.util.Scanner;
    public class ex_18 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int num, sum = 0, count = 0;
            double avg;

            do {
                System.out.print("Digite um número (digite 0 para encerrar): ");
                num = scanner.nextInt();

                if (num % 2 == 0 && num != 0) {
                    sum += num;
                    count++;
                }
            } while (num != 0);

            if (count == 0) {
                System.out.println("Nenhum número par foi digitado.");
            } else {
                avg = (double) sum / count;
                System.out.printf("A média dos números pares digitados é %.2f.", avg);
            }

            scanner.close();
        }
    }



