import java.util.Scanner;

public class ex_14 {
        public static void main(String[] args) {
            Scanner Imput = new Scanner(System.in);

            System.out.print("Digite um número inteiro positivo: ");
            int n = Imput.nextInt();

            int soma = 0;
            for (int contador = 1; contador < n; contador++) {
                System.out.println(contador);
                soma += contador;
            }

            double media = (double) soma / (n - 1);

            System.out.println("Soma dos inteiros positivos menores que " + n + ": " + soma);
            System.out.println("Média dos inteiros positivos menores que " + n + ": " + media);

            Imput.close();
        }
    }

