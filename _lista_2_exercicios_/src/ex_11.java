import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int lcomp;

        System.out.println("DIGITE O NUMERO DE LARANJAS COMPRADAS");
        lcomp = imput.nextInt();

            if (lcomp >= 12) {
                System.out.println(lcomp + " UNIDADES(S) DE LARANJA A R$ 0,25 A UNIDADE É R$ " + lcomp * 0.25);
            } else {
                System.out.println(lcomp + " UNIDADES(S) DE LARANJA A R$ 0,30 A UNIDADE É R$ " + lcomp * 0.30);
            }
        }
    }
