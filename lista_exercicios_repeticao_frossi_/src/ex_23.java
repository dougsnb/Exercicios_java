import java.util.Scanner;

public class ex_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota, soma = 0, media;
        double maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;

        System.out.print("Digite a quantidade de alunos da turma: ");
        int qtdAlunos = input.nextInt();

        for (int i = 1; i <= qtdAlunos; i++) {
            System.out.printf("Digite a nota do %dº aluno: ", i);
            nota = input.nextDouble();
            soma += nota;
            if (nota > maior) {
                maior = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
        }

        media = soma / qtdAlunos;
        System.out.printf("Média da turma: %.2f\n", media);
        System.out.printf("Maior nota da turma: %.2f\n", maior);
        System.out.printf("Menor nota da turma: %.2f\n", menor);
        System.out.println("Fim da execução.");
    }
}
