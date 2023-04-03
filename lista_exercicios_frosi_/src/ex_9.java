import java.util.Scanner;

public class ex_9 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int a, b, c;


        System.out.println("DIGITE OS TRêS LADOS DO TRIÂNGULO");
        a = imput.nextInt();
        b = imput.nextInt();
        c = imput.nextInt();

        if (a == b && b == c && c == a) {
            if (a == b && b == c) {
                System.out.println("POSSUI TODOS OS LADOS IGUAIS");
            } else {
                System.out.println("POSSUI DOIS LADOS IGUAIS");
            }
        }
        if (a != b && b != c && c != a) {
            System.out.println("TODOS OS LADOS SÃO DIFERENTES");
        }
    }
}
