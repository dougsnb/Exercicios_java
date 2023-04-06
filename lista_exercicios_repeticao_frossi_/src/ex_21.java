import java.util.Scanner;

public class ex_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 15; i++) {
            System.out.printf("Digite o %dº número: ", i);
            num = input.nextInt();
            if (num > maior) {
                maior = num;
            }
        }

        System.out.printf("Maior valor encontrado: %d\n", maior);
        System.out.println("Fim da execução.");
    }
}
