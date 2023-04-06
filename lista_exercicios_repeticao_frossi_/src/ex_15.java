import java.util.Scanner;

public class ex_15 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int intervalo1 = 0;
            int intervalo2 = 0;
            int intervalo3 = 0;
            int intervalo4 = 0;

            int num;

            do {
                System.out.print("Digite um número (negativo para sair): ");
                num = scanner.nextInt();

                if (num >= 0 && num <= 25) {
                    intervalo1++;
                } else if (num >= 26 && num <= 50) {
                    intervalo2++;
                } else if (num >= 51 && num <= 75) {
                    intervalo3++;
                } else if (num >= 76 && num <= 100) {
                    intervalo4++;
                }
            } while (num >= 0);

            System.out.println("Quantidade de números no intervalo [0,25]: " + intervalo1);
            System.out.println("Quantidade de números no intervalo [26,50]: " + intervalo2);
            System.out.println("Quantidade de números no intervalo [51,75]: " + intervalo3);
            System.out.println("Quantidade de números no intervalo [76,100]: " + intervalo4);

            scanner.close();
        }
    }


