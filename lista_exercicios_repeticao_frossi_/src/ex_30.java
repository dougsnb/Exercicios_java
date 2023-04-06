import java.util.Scanner;

public class ex_30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, contMulheresSalarioBaixo = 0, contHomens = 0;
        char sexo;
        double salario, mediaSalario = 0, somaSalario = 0, mediaIdadeHomens = 0;
        int maiorIdade = 0, menorIdade = Integer.MAX_VALUE;

        do {
            System.out.print("Digite a idade (-1 para encerrar): ");
            idade = entrada.nextInt();

            if (idade >= 0) {
                System.out.print("Digite o sexo (M/F): ");
                sexo = entrada.next().charAt(0);

                System.out.print("Digite o salário: R$");
                salario = entrada.nextDouble();

                // Calcula a média do salário
                somaSalario += salario;
                mediaSalario = somaSalario / (contHomens + contMulheresSalarioBaixo);

                // Identifica a maior e menor idade
                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }
                if (idade < menorIdade) {
                    menorIdade = idade;
                }

                // Calcula a média da idade dos homens
                if (sexo == 'M') {
                    mediaIdadeHomens = ((mediaIdadeHomens * contHomens) + idade) / (contHomens + 1);
                    contHomens++;
                }

                // Conta a quantidade de mulheres com salário até R$1000,00
                if (sexo == 'F' && salario <= 1000) {
                    contMulheresSalarioBaixo++;
                }
            }
        } while (idade >= 0);

        System.out.println("\nResultados da pesquisa:");
        System.out.printf("Média do salário do grupo: R$%.2f\n", mediaSalario);
        System.out.printf("Maior idade do grupo: %d\n", maiorIdade);
        System.out.printf("Menor idade do grupo: %d\n", menorIdade);
        System.out.printf("Média da idade dos homens: %.1f\n", mediaIdadeHomens);
        System.out.printf("Quantidade de mulheres com salário até R$1000,00: %d\n", contMulheresSalarioBaixo);
    }
}
