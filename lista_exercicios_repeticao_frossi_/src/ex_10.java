import java.util.Scanner;

    public class ex_10 {
        public static void main(String[] args) {
            Scanner Imput = new Scanner(System.in);
            int numero;

            do {
                System.out.print("DIGITE UM NÚMERO (OU 0 PARA ENCERRAR O PROGRAMA):");
                numero = Imput.nextInt();

                if (numero > 0) {
                    System.out.println(numero + " É POSITIVO");
                } else if (numero < 0) {
                    System.out.println(numero + " É NEGATIVO");
                }
            } while (numero != 0);
        }
    }


