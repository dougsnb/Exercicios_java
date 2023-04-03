import java.util.Scanner;

public class ex_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, maior;

        System.out.print("Digite dois numeros ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("São iguais");
        } else {
            if (num1 % 2 == 0) {
                System.out.print("Digite o terceiro número: ");
                num3 = input.nextInt();
                maior = Math.max(num1, Math.max(num2, num3));
            } else {
                System.out.print("Digite o terceiro número: ");
                num3 = input.nextInt();
                System.out.print("Digite o quarto número: ");
                num4 = input.nextInt();
                int maior1 = Math.max(num1, num2);
                int maior2 = Math.max(num3, num4);
                if (maior1 > maior2) {
                    maior = Math.max(maior1, num3);
                } else {
                    maior = Math.max(maior2, num1);
                }
            }
            System.out.println("O maior número é: " + maior);
        }

        input.close();
    }
}
