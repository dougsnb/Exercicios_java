import java.util.Arrays;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner Imput = new Scanner(System.in);
            Float tempC , tempF;

        System.out.println("DIGITE A TEMPERATURA EM FAHRENHEIT");
            tempF = Imput.nextFloat();

            tempC = (5*(tempF - 32))/9;

        System.out.printf("A TEMPERATURA EM GRAUS CELCIUS É: %.1f\n", tempC);

    }
}
