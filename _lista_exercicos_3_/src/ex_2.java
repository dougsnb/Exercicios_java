import java.util.Arrays;
import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numA, numB, numt = 0,soma = 0;

        System.out.println("DIGITE DOIS NUMEROS INTEROS POSITIVOS");
        numA = entrada.nextInt();
        numB = entrada.nextInt();

        entrada.close();

            if (numA >= numB) {
                numt = numB;
                numB = numA;
                numA = numt;
        }
            while (numB != numA) {

                int divcinco = numB % 5;

                if (divcinco == 0) {
            System.out.println(numB);
            soma += numB;

        }
                numB--;
            }
        System.out.println("A SOMA DO NUMERO DIVISÍVEIS POR 5 É: " + soma);
        }
    }

