import java.util.Arrays;
import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int dum = 0, ddois = 0, dtres = 0, dquatro = 0;

        System.out.println("DIGITE A SENHA DE QUATRO DIGITOS");
            dum = imput.nextInt();
            ddois = imput.nextInt();
            dtres = imput.nextInt();
            dquatro = imput.nextInt();

            if ((dum == 1) && (ddois == 2) && (dtres == 3) && (dquatro == 4)){
                System.out.println("ACESSO PERMITODO");
        } else {
                System.out.println("ACESSO NEGADO");
            }
    }
}
