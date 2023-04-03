import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner Imput = new Scanner(System.in);

        int negativos = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "° número: ");
            int numero = Imput.nextInt();
            if (numero < 0) {
                negativos++;
            }
        }

        System.out.println("Foram digitados " + negativos + " números negativos.");
    }
}
