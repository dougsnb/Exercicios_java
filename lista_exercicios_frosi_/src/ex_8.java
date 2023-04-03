import java.util.Arrays;
import java.util.Scanner;

public class ex_8 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int anonasc, idade;

        System.out.println("DIGITE SEU ANO DE NASCIMENTO");
            anonasc = imput.nextInt();

        idade = 2023 - anonasc;

        System.out.println(idade + " ANOS");

        if (idade >= 18) {
            System.out.println("VOCÊ ESTÁ APTO Á VOTAR ESSE ANO");
        }
        else if (idade <= 17){
            System.out.println("VOCÊ NÃO ESTÁ APTO Á VOTAR ESSE ANO");
        }
    }
}
