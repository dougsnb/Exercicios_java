/*
 * Crie um programa em Java que receba do usuário um número inteiro
 * positivo e informe os totais de números pares e ímpares encontrados entre 1 e o número
 * digitado + o somatório dos pares e ímpares separadamente.
 */

import java.util.Scanner;

public class ex_1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador, numeroDigitado, numerosPares = 0, numerosImpares = 0, ePar = 0, somaPar = 0, somaImpar = 0;

        System.out.println("Digite um número inteiro positivo.");
        numeroDigitado = entrada.nextInt();
        entrada.close();

        for(contador = numeroDigitado; contador >= 1; contador--) {

            ePar = contador % 2;

            if(ePar == 0) {
                numerosPares++;
                somaPar += contador;
            }
            else {
                numerosImpares++;
                somaImpar += contador;
            }
        }

        System.out.printf("Total de números pares: %d\n"
                        + "Total de números ímpares: %d\n"
                        + "Somatório dos números pares: %d\n"
                        + "Somatório de números ímpares: %d\n",
                numerosPares, numerosImpares, somaPar, somaImpar);
    }
}