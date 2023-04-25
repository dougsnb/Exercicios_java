import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[6];

        // Lê os elementos do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "o elemento do vetor: ");
            vetor[i] = input.nextInt();
        }

        // Mostra o menu de opções
        System.out.println("\nEscolha a opcao desejada:");
        System.out.println("1- Soma dos elementos");
        System.out.println("2- Produto dos elementos");
        System.out.println("3- Média dos elementos");
        System.out.println("4- Mostre o vetor");

        // Lê a opção do usuário
        System.out.print("Opcao: ");
        int opcao = input.nextInt();

        // Executa a operação escolhida
        switch (opcao) {
            case 1:
                int soma = 0;
                for (int i = 0; i < vetor.length; i++) {
                    soma += vetor[i];
                }
                System.out.println("Soma dos elementos: " + soma);
                break;
            case 2:
                int produto = 1;
                for (int i = 0; i < vetor.length; i++) {
                    produto *= vetor[i];
                }
                System.out.println("Produto dos elementos: " + produto);
                break;
            case 3:
                double media = 0;
                for (int i = 0; i < vetor.length; i++) {
                    media += vetor[i];
                }
                media /= vetor.length;
                System.out.println("Média dos elementos: " + media);
                break;
            case 4:
                System.out.print("Vetor: ");
                for (int i = 0; i < vetor.length; i++) {
                    System.out.print(vetor[i] + " ");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }

        input.close();
    }
}