import java.util.Scanner;

public class ex_15 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int num1, num2;

        System.out.println("DIGITE DOIS NUMERO");
        num1 = imput.nextInt();
        num2 = imput.nextInt();

        if (num1 > 0) {
            System.out.println(num1 + " MAIOR");
        }
        else {
            System.out.println(num2 + " MENOR");
        }
        if (num2 > 0) {
            System.out.println(num2 + " MAIOR");
        }
        else {
            System.out.println(num1 + " MENOR");
        }
        if (num1 == num2) {
            System.out.println (num1 +"\t"+ "\t"+ num2 + "SÃO IGUAIS");
        }
    }
}
