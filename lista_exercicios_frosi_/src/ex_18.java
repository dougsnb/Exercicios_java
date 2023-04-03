import java.util.Scanner;

public class ex_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("DIGITE O VALOR DA COMPRA R$: ");
        double precoT = input.nextDouble();

        System.out.print("QUANTAS VEZES? ");
        int numParc = input.nextInt();

        double precoFinal;
        double valorParcela;

        if (numParc == 1) {

            precoFinal = precoT * 0.975;
            valorParcela = precoFinal;
        } else if (numParc >= 2 && numParc <= 5) {
            precoFinal = precoT;
            valorParcela = precoFinal / numParc;

        } else if (numParc >= 6 && numParc <= 10) {
            precoFinal = precoT * 1.06;
            valorParcela = precoFinal / numParc;

        } else if (numParc >= 11 && numParc <= 15) {
            precoFinal = precoT * 1.13;
            valorParcela = precoFinal / numParc;

        } else {
            System.out.println("PARCELAS INVALIDAS");
            return;
        }

        System.out.printf("VALOR DA COMPRA: R$ %.2f\n", precoT);
        System.out.printf("NUMERO DE VEZES: %d\n", numParc);
        System.out.printf("VALOE DAS PARCELAS: R$ %.2f\n", valorParcela);
        System.out.printf("PREÇO TOTAL: R$ %.2f\n", precoFinal);
    }
}

