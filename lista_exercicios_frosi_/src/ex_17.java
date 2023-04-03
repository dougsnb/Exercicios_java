import java.util.Scanner;

public class ex_17 {
    public static void main(String[] args) {
        Scanner Imput = new Scanner(System.in);

        int num1, num2, num3, maior;

        System.out.println("DIGITE TRÊS NUMEROS");
        num1 = Imput.nextInt();
        num2 = Imput.nextInt();
        num3 = Imput.nextInt();

        if ((num1 >= num2) && (num1 >= num3)) {
            maior = num1;
        } else if ((num2 > +num1) && (num2 >= num3)) {
            maior = num2;
        } else {
            maior = num3;
            System.out.println("MAIOR NUMERO É: " + maior);
            Imput.close();
        }
    }
}
