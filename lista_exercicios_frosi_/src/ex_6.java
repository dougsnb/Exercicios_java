import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int num1, num2;

        System.out.println("DIGITE DOIS VALORES");
        num1 = imput.nextInt();
        num2 = imput.nextInt();

        if ((num1 > num2)) {
            System.out.println("O MAIOR NÚMERO É " + num1);
        } else {
            System.out.println("O MAIOR NÚMERO É " + num2);
    }
}
}
