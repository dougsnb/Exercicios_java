import java.util.Scanner;

public class ex_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo;
        double valor, totalDebitos = 0, totalCreditos = 0;

        do {
            System.out.print("Digite o código da operação (1 débito / 2 crédito / 0 fim): ");
            codigo = sc.nextInt();

            if (codigo == 1) {
                System.out.print("Digite o valor do débito: ");
                valor = sc.nextDouble();
                totalDebitos += valor;
            } else if (codigo == 2) {
                System.out.print("Digite o valor do crédito: ");
                valor = sc.nextDouble();
                totalCreditos += valor;
            } else if (codigo == 0) {
                System.out.println("Programa encerrado!");
            } else {
                System.out.println("Código inválido!");
            }

        } while (codigo != 0);

        double saldo = totalCreditos - totalDebitos;

        System.out.printf("Total de débitos: %.2f\n", totalDebitos);
        System.out.printf("Total de créditos: %.2f\n", totalCreditos);
        System.out.printf("Saldo: %.2f\n", saldo);

        sc.close();
    }
}
