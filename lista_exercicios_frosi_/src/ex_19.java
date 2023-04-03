import java.util.Scanner;

public class ex_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("DIGITE SUA IDADE");
        int idade = input.nextInt();

        System.out.print("QUAL SEU PESO?");
        double peso = input.nextDouble();

        if (idade <= 12){
            System.out.println("CATEGORIA : INFANTIL");
        }
        else if ((idade >= 13) && (idade <= 16) && (peso <= 40)){
            System.out.println("CATEGORIA : JUVENIL LEVE");
        }
        else if ((idade >= 17) && (idade <= 24) && (peso <= 40)){
            System.out.println("CATEGORIA : JUVENIL PESADO");
        }
        else if ((idade >= 17) && (idade <= 24) && (peso <= 45))  {
            System.out.println("CATEGORIA : SENIOR LEVE");
        }
        else if((idade >= 17) && (idade <= 24) && (peso > 45.1) && (peso <+ 60)){
            System.out.println("CATEGORIA : SENIOR MÉDIO");
        }
        else if ((idade >= 17) && (idade <= 24) && (peso > 60));{
            System.out.println("CATEGORIA : SENIOR PESADO");
        }
        if (idade >= 24){
            System.out.println("CATEGORIA : VETERANO");
        }

    }
}

