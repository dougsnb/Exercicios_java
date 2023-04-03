import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("DIGITE UM NÚMERO: ( ou um numero negativo ou zero, para encerrar o programa )");
            numero = scanner.nextInt();

            if (numero <= 0) {
                break;
            }

            if (numero % 2 == 0) {
                System.out.println(numero + " É PAR");
            } else {
                System.out.println(numero + " É IMPAR");
            }
        }
    }
}
