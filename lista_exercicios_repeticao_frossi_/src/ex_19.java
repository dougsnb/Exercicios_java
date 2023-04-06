import java.util.Scanner;
    public class ex_19 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int nchamada;
            double nota1, nota2, nota3, media;
            System.out.println("DIGITE");
                nchamada = input.nextInt();

            while (nchamada != 0) {
                nota1 = input.nextDouble();
                nota2 = input.nextDouble();
                nota3 = input.nextDouble();

                media = (nota1 + nota2 + nota3) / 3;
                System.out.printf("Aluno %d:\nMédia = %.2f\n", nchamada, media);

                nchamada = input.nextInt();
            }
            System.out.println("Fim da execução.");
        }
    }

