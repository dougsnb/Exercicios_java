import java.util.Arrays;
import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        //VALORES DOS PRODUTOS
        double banana = 0.30, laranja = 0.40, maçã = 0.50, kiwi = 0.40;
        double dbanana = 0.25, dlaranja = 0.30, dmaça = 0.45, dkiwi = 0.30;
        //FORMA DE PAGAMENTO
        int pagamento = 0;
        double valorDesconto = 0.0, valorFinal = 0.0;

        System.out.println("------- LISTA DE PRODUTOS -------");
        System.out.println("1. BANANA -> R$ O,30 PREÇO DA UNIDADE OU R$ O,25 PREÇO DUZIA OU MAIS");
        System.out.println("2. LARANJA -> R$ O,40 PREÇO DA UNIDADE OU R$ O,35 PREÇO DUZIA OU MAIS");
        System.out.println("3. MAÇÃ -> R$ O,50 PREÇO DA UNIDADE OU R$ O,45 PREÇO DUZIA OU MAIS");
        System.out.println("4. KIWI -> R$ O,40 PREÇO DA UNIDADE OU R$ O,30 PREÇO DUZIA OU MAIS");

        System.out.print("DIGITE O NUMERO DO PRODUTO DESEJADO: ");
        int opcao = imput.nextInt();
        System.out.print("DIGITE A QUANTIDADE DESEJADA: ");
        int quantidade = imput.nextInt();


        System.out.println("------- VALOR DE COMPRA -------");

        double valorCompra = 0;
        switch (opcao) {
            case 1:
                if (quantidade <= 12) {
                    valorCompra = quantidade * banana;
                } else {
                    valorCompra = quantidade * dbanana;
                }
                break;
            case 2:
                if (quantidade <= 12) {
                    valorCompra = quantidade * laranja;
                } else {
                    valorCompra = quantidade * dlaranja;
                }
                break;
            case 3:
                if (quantidade <= 12) {
                    valorCompra = quantidade * maçã;
                } else {
                    valorCompra = quantidade * dmaça;
                }
                break;
            case 4:
                if (quantidade <= 12) {
                    valorCompra = quantidade * kiwi;
                } else {
                    valorCompra = quantidade * dkiwi;
                }
                break;
        }

        System.out.printf("TOTAL: R$ %.2f", valorCompra);


        System.out.println("\nESCOLHA A FORMA DE PAGAMENTO:");
        System.out.println("1 - À VISTA (DESCONTO DE 10%)");
        System.out.println("2 - DÉBITO");
        System.out.println("3 - CRÉDITO (COM JUROS)");
        pagamento = imput.nextInt();

        switch (pagamento) {
            case 1:
                valorDesconto = valorCompra * 0.1;
                valorFinal = valorCompra - valorDesconto;
                System.out.println("VALOR A SER PAGO: R$ " + valorFinal + "\nPAGAMENTO REALIZADO");
                break;
            case 2:
                valorFinal = valorCompra;
                System.out.println("INSIRA O VALOR A SER DEBITADO NO CARTÃO: R$" + valorFinal);
                if (valorFinal == valorCompra) {
                    System.out.println("PAGAMENTO REALIZADO");
                }
                break;
            case 3:
                valorFinal = valorCompra;
                System.out.println("VALOR A SER CREDITADO NO CARTÃO: R$" + valorFinal);

                System.out.println("\nEscolha a opção de parcelamento:");
                System.out.println("1 - 2x sem juros");
                System.out.println("2 - 3x com 10% de juros");
                System.out.println("3 - 4x com 20% de juros");
                int opc = imput.nextInt();

                switch (opcao) {
                    case 1:
                        double valorParcela1 = valorCompra / 2;
                        System.out.printf("Valor da parcela 1: R$ %.2f\n", valorParcela1);
                        double valorParcela2 = valorCompra / 2;
                        System.out.printf("Valor da parcela 2: R$ %.2f\n", valorParcela2);
                        break;
                    case 2:
                        double valorParcela3 = valorCompra * 1.1 / 3;
                        System.out.printf("Valor da parcela 1: R$ %.2f\n", valorParcela3);
                        double valorParcela4 = valorCompra * 1.1 / 3;
                        System.out.printf("Valor da parcela 2: R$ %.2f\n", valorParcela4);
                        double valorParcela5 = valorCompra * 1.1 / 3;
                        System.out.printf("Valor da parcela 3: R$ %.2f\n", valorParcela5);
                        break;
                    case 3:
                        double valorParcela6 = valorCompra * 1.2 / 4;
                        System.out.printf("Valor da parcela 1: R$ %.2f\n", valorParcela6);
                        double valorParcela7 = valorCompra * 1.2 / 4;
                        System.out.printf("Valor da parcela 2: R$ %.2f\n", valorParcela7);
                        double valorParcela8 = valorCompra * 1.2 / 4;
                        System.out.printf("Valor da parcela 3: R$ %.2f\n", valorParcela8);
                        double valorParcela9 = valorCompra * 1.2 / 4;
                        System.out.printf("Valor da parcela 4: R$ %.2f\n", valorParcela9);
                        break;
                }
                System.out.println("VALOR TOTAL COM O JUROS: R$ " + valorFinal);
        }
    }
}
