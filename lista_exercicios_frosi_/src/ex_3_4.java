import java.util.Scanner;

public class ex_3_4 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        double notaum, notadois, soma, media;

        System.out.println("DIGITE SUAS NOTAS");
        notaum = imput.nextDouble();
        notadois = imput.nextDouble();

        soma = notaum + notadois;
        media = soma / 2;

        if (media >= 6){
            System.out.println("PARÁBENS! Você foi aprovado");
        } else {
            System.out.println("Você foi REPROVADO! Estude mais");
        }
    }
}
