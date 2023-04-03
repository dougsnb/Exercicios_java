
import java.util.Scanner;
    public class test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero;

            while (true) {
                System.out.print("Digite um número (ou um número negativo para sair): ");
                numero = scanner.nextInt();

                if (numero <= 0) {
                    break;
                }

                if (numero % 2 == 0) {
                    System.out.println(numero + " é PAR");
                } else {
                    System.out.println(numero + " é ÍMPAR");
                }
            }
        }

    }


