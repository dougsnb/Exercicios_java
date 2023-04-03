import java.util.Arrays;
import java.util.Scanner;

public class ex_5 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        double notaum, notadois, soma, media;

        System.out.println("DIGITE SUAS NOTAS");
        notaum = imput.nextDouble();
        notadois = imput.nextDouble();

        soma = notaum + notadois;
        media = soma / 2;

        if (media >= 6){
            System.out.println("APROVADO");
        } else if ((media < 6) && (media > 3)){
            System.out.println("EXAME");
        } else System.out.println("REPROVADO");
    }
}

