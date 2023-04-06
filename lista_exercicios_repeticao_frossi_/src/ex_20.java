import java.util.Scanner;
    public class ex_20 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num, soma = 0, cont = 0;
            double media;

            System.out.println("DIGITE");
            num = input.nextInt();

            while (num >= 0) {
                soma += num;
                cont++;
                num = input.nextInt();
            }

            if (cont > 0) {
                media = (double) soma / cont;
                System.out.printf("Média dos valores lidos: %.2f\n", media);
            } else {
                System.out.println("Não foram lidos valores positivos.");
            }
            System.out.println("Fim da execução.");
        }
    }

