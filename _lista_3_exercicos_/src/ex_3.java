import java.util.Scanner;

public class ex_3 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        int numD, numD2, somaD = 0;

        do {

            System.out.println("Digite um número inteiro positivo.");
            numD = imput.nextInt();

        } while (numD < 0);

        imput.close();

        for (numD2 = numD; numD2 >= 1; numD2--) {


            int divisao = numD % numD2;

            if (divisao == 0 && numD != numD2) {

                somaD += numD2;
            }


        }

        if (somaD == numD) {

            System.out.println(numD + " é um número perfeito.");
        }
        else {

            System.out.println(numD + " NÃO é um número perfeito.");
        }

    }
}