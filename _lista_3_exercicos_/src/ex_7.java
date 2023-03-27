import java.util.Scanner;

public class ex_7 {

        public static void main(String[] args) {

            Scanner Imput = new Scanner(System.in);

            int num = 1;


            while(num != 0) {

                System.out.println("Digite um número inteiro.");
                num = Imput.nextInt();

                for(int contador = 1; contador <= num; contador++) {
                    System.out.printf("%d * %d = %d\n", contador, num, contador * num);
                }

            }
            System.out.println("Programa encerrado.");
            Imput.close();

        }
    }

