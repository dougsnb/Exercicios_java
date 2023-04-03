import java.util.Arrays;
import java.util.Scanner;

public class ex_13 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        float fem, masc, genero, altura = 0, peso = 0;

        System.out.println("DIGITE SUA ALTURA?");
        altura = imput.nextFloat();

        System.out.println("QUAL SEU GENERO?");
        System.out.println("1 - MASCULINO");
        System.out.println("2 - FEMININO");

        System.out.println("ESCOLHA UMA DAS OPÇÕES");
        float opcao = imput.nextFloat();

        if (opcao == 1) {
            peso = 72.7f * altura - 58;
        }
        if (opcao == 2) {
            peso = 62.1f * altura - 44.7f;
        }
        System.out.printf("SEU PESO IDEAL É DE:" + peso + "KILOS");
        {

        }
    }
}
