import java.util.Scanner;

public class ex_17 {
        public static void main(String[] args) {
            Scanner Imput = new Scanner(System.in);

            int senha;

            do {
                System.out.print("Digite a senha: ");
                senha = Imput.nextInt();

                if (senha != 2807) {
                    System.out.println("SENHA INVÁLIDA");
                }
            } while (senha != 2807);

            System.out.println("ACESSO PERMITIDO");

            Imput.close();
        }
    }

