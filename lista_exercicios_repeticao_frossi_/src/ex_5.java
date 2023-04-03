import java.util.Arrays;
import java.util.Scanner;

public class ex_5 {
    public static void main(String[] args) {
        Scanner Imput = new Scanner(System.in);

        System.out.println("---------- DIAS DA SEMANA ----------");
        System.out.println("1 - SEGUNDA-FEIRA");
        System.out.println("2 - TERÇA-FEIRA");
        System.out.println("3 - QUARTA-FEIRA");
        System.out.println("4 - QUINTA-FEIRA");
        System.out.println("5 - SEXTA-FEIRA");
        System.out.println("6 - SÁBADO-FEIRA");
        System.out.println("7 - DOMINGO-FEIRA");

        System.out.println("\nQUAL DIA DA SEMANA?");
        int opcao = Imput.nextInt();

        if (opcao == 6) {
        } else if (opcao == 7) {
            System.out.println("FINAL DE SEMANA");
        }
        else System.out.println("DIA ÚTil");
    }
}



