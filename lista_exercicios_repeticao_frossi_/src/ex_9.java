import java.util.Scanner;

public class ex_9 {
    public static void main(String[] args) {
        Scanner Imput = new Scanner(System.in);

        int menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE, num;

        for (int contador = 1; contador <= 50; contador++){
            System.out.println("DIGITE O " + contador + "° NÚMERO");
                num = Imput.nextInt();

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("MAIOR VALOR: " + maior);
        System.out.println("MENOR VALOR: " + menor);
    }
}
