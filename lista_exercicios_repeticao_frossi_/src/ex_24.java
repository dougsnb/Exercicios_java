import java.util.Scanner;

public class ex_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo;
        double precoCusto, precoNovo, somaComAumento = 0, somaSemAumento = 0;
        int qtdProdutos = 0;

        System.out.println("Entre com o código e o preço de custo de cada produto (código negativo para encerrar):");
        do {
            System.out.print("Código do produto: ");
            codigo = input.nextInt();
            if (codigo >= 0) {
                System.out.print("Preço de custo: ");
                precoCusto = input.nextDouble();
                precoNovo = precoCusto * 1.2;
                somaComAumento += precoNovo;
                somaSemAumento += precoCusto;
                qtdProdutos++;
                System.out.printf("Código do produto: %d | Preço novo: %.2f\n", codigo, precoNovo);
            }
        } while (codigo >= 0);

        double mediaComAumento = somaComAumento / qtdProdutos;
        double mediaSemAumento = somaSemAumento / qtdProdutos;

        System.out.printf("Média dos preços com aumento: %.2f\n", mediaComAumento);
        System.out.printf("Média dos preços sem aumento: %.2f\n", mediaSemAumento);
        System.out.println("Fim da execução.");
    }
}
