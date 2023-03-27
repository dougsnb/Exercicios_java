import jdk.jfr.Percentage;

import java.util.Arrays;
import java.util.Scanner;

public class ex_9 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int eleitores = 0, vbrancos, vnulos, validos, resultado;
        int percetage;

        System.out.println("ENTRE COM O NUMERO DE ELEITORES");
        eleitores = imput.nextInt();
        System.out.println("ENTRE COM O NUMERO DE VOTOS EM BRANCO");
        vbrancos = imput.nextInt();
        System.out.println("ENTRE COM O NUMERO DE VOTOS NULOS");
        vnulos = imput.nextInt();
        System.out.println("ENTRE COM O NUMERO DE VOTOS VALIDOS");
        validos = imput.nextInt();

        percetage = (int) ((vbrancos * 100) / eleitores);
            System.out.println(percetage+"%" + " DOS VOTOS EM BRANCOS");
        percetage = (int) ((vnulos * 100) / eleitores);
            System.out.println(percetage+"%" + " DOS VOTOS NULOS");
        percetage = (int) ((validos * 100) / eleitores);
            System.out.println(percetage+"%" + " DOS VOTOS VÁLIDOS");
    }
}