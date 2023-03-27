import java.util.Arrays;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner Imput = new Scanner(System.in);

        int qhomem, qmulher, qcrianca, tcarne;
        int ghomem = 650, gmulher = 420, gcrianca = 290;

        System.out.println("DIGITE A QUANTIDA DE HOMENS");
            qhomem = Imput.nextInt();
        System.out.println("DIGITE A QUANTIDA DE MULHERES");
            qmulher = Imput.nextInt();
        System.out.println("DIGITE A QUANTIDA DE CRINÇAS");
            qcrianca = Imput.nextInt();

    tcarne = (qhomem * ghomem) + (qmulher * gmulher) + (qcrianca * gcrianca);

        System.out.println("QUANTIDADE DE CARNE SUGERIDA É" + tcarne);



    }

}
