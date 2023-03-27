import java.util.Scanner;

public class ex_4 {

        public static void main(String[] args) {


            Scanner imput= new Scanner(System.in);

            int numA, numB;

            do {


                System.out.println("Digite dois valores inteiros.");
                numA = imput.nextInt();
                numB = imput.nextInt();

                if (numA < numB) {

                    System.out.println("Você informou os números em ordem crescente");
                }
                else {


                    if (numA == numB) {
                        System.out.println("Os números são iguais. Fim.");
                    }
                    else {
                        System.out.println("Você informou os números em ordem decrescente");
                    }

                }


            } while (numA != numB);

        }
    }

