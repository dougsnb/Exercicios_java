import java.util.Scanner;

public class ex_raiz {
    public static void main(String[] args) {
        Scanner soma = new Scanner(System.in);
            int num1;
            double resultado;
        System.out.println("Seu número é");
            num1 = soma.nextInt();
            resultado = Math.sqrt(num1);

        System.out.printf("o número é: %d\n",num1);
        System.out.println("e sua raiz é" + resultado);

    }
}