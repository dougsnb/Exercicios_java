import java.util.Scanner;
public class ex_2 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int valor = 0, vv;

        System.out.println("DIGITE UM NÚMERO");
        valor = imput.nextInt();

        if (valor > 1) {
            System.out.println("O NÚMERO " + valor + " É POSTIVO");
        } else
            System.out.println("O NÚMERO " + valor + " É NEGATIVO " + "SUA MULTIPLIÇÃO POR -1 É " + valor * -1);
        }
    }


