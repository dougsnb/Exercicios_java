import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int mcomp;

        System.out.println("DIGITE O NUMERO DE MAÇAS COMPRADAS");
        mcomp = imput.nextInt();

        if (mcomp >= 12) {
            System.out.println(mcomp + " UNIDADES(S) DE MAÇAS É R$ 0,25 A UNIDADE É R$ " + mcomp * 0.25);
        } else {
            System.out.println(mcomp + " UNIDADES(S) DE MAÇAS É R$ 0,30 A UNIDADE É R$ " + mcomp * 0.30);
        }
    }
}
