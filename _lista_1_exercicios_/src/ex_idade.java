import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ex_idade {
    public static void main(String[] args) {
        Scanner soma = new Scanner(System.in);

        int anonasc, idade;

        System.out.println("Digite seu ano de nascimento");
            anonasc = soma.nextInt();
                idade = 2023 - anonasc;

            System.out.println("Sua idade é" + idade);




    }

}
