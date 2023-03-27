import java.util.Arrays;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner Imput = new Scanner(System.in);
     float hr, min, seg, tseg;

        System.out.println("DIGITE AS HORAS, MINUTOS E SEGUNDOS DO DIA DESEJADO");

    hr = Imput.nextFloat();
    min = Imput.nextFloat();
    seg = Imput.nextFloat();

        tseg = (hr * 60 * 60) + (min * 60) + seg;

        System.out.printf("TOTAL DE SEGUNDOS DO DIA É: %.1f\n", tseg);

    }
}
