import java.util.Scanner;

public class ex_8 {

    public static void main(String[] args) {

        Scanner Imput = new Scanner(System.in);

        int SImulher = 0,SIhomem = 0,Chomem = 0,Cmulher = 0,Mhomem = 0,Mmulher = 0;

        boolean continuação = true;
         String genero;
            System.out.println("Programa iniciado.\n");
            do {
             System.out.println("Digite o sexo. (M/F)");
                genero = Imput.next();

             if (genero.equals("M") || genero.equals("m")) {
                    System.out.println("Digite a idade.");
                  int idade = Imput.nextInt();
                     Chomem++;
                     SIhomem += idade;
                     Mhomem = SIhomem / Chomem;
                } else {
                 if (genero.equals("F") || genero.equals("f")) {
                         System.out.println("Digite a idade.");
                      int idade = Imput.nextInt();
                         Cmulher++;
                         SImulher += idade;
                        Mmulher = SImulher / Cmulher;
                   } else {
                       continuação = false;
                   }
                }
                System.out.printf("Média de idade dos homens: %d\n", Mhomem);
                System.out.printf("Média de idade das mulheres: %d\n", Mmulher);
         } while (continuação);
            System.out.println("Programa encerrado.");
                Imput.close();
    }
}
