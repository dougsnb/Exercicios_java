import java.util.Arrays;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner Imput =  new Scanner(System.in);

    float  compP, compM, tamP = (float) 25.4;

        System.out.println("DIGITE O COMPRIMENTO EM POLEGADAS");
        compP = Imput.nextFloat();

    compM = compP * tamP;

        System.out.printf("O COMPRIMENTO EM MILIMETROS É: %.1f\n", compM);

    }
}
