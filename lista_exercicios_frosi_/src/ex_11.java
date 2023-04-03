import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int num1, num2;

        System.out.println("DIGITE DOIS VALORES");
        num1 = imput.nextInt();
        num2 = imput.nextInt();

        if ((num1 < num2)) {
            System.out.println((num1)+"\t"+(num2));
        } else {
            System.out.println((num2)+"\t"+(num1));
        }
    }
}
