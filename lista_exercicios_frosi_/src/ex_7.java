import java.util.Scanner;

public class ex_7 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int num1;

        System.out.println("DIGITE UM NUMERO");
        num1 = imput.nextInt();

        if ((num1 >= 1) && (num1 <= 9)) {
            System.out.println("ESTÁ NA FAIXA PERMITIDA ");
        } else {
            System.out.println("NÃO ESTÁ NA FAIXA PERMITIDA ");
        }
    }
}



