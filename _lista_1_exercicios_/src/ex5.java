import java.util.Arrays;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner Imput = new Scanner(System.in);

        Float raio, areacirculo, pi = (float) 3.14;

        System.out.println("DIGITE O RAIO DO CIRCULO");
        raio = Imput.nextFloat();

        areacirculo = pi * (raio * raio);

        System.out.printf("A AREA DO CIRCULO É: %.2f\n",areacirculo);

    }
}
