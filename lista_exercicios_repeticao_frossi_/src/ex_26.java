import java.util.Scanner;

public class ex_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int voto, votosA = 0, votosB = 0, votosC = 0, votosD = 0, votosNulos = 0, votosBrancos = 0;

        System.out.println("1 - Candidato A");
        System.out.println("2 - Candidato B");
        System.out.println("3 - Candidato C");
        System.out.println("4 - Candidato D");
        System.out.println("5 - Nulo");
        System.out.println("6 - Branco");
        System.out.println("Digite o código do seu voto:");

        voto = input.nextInt();
        while (voto > 0) {
            switch (voto) {
                case 1:
                    votosA++;
                    break;
                case 2:
                    votosB++;
                    break;
                case 3:
                    votosC++;
                    break;
                case 4:
                    votosD++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
                default:
                    System.out.println("Código de voto inválido!");
            }
            System.out.println("1 - Candidato A");
            System.out.println("2 - Candidato B");
            System.out.println("3 - Candidato C");
            System.out.println("4 - Candidato D");
            System.out.println("5 - Nulo");
            System.out.println("6 - Branco");
            System.out.println("Digite o código do seu voto:");
            voto = input.nextInt();
        }

        int totalVotosValidos = votosA + votosB + votosC + votosD;
        System.out.println("Resultado da eleição:\n");
        System.out.println("Total de votos para o candidato A: " + votosA);
        System.out.println("Total de votos para o candidato B: " + votosB);
        System.out.println("Total de votos para o candidato C: " + votosC);
        System.out.println("Total de votos para o candidato D: " + votosD);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBrancos);
        System.out.println("Total de votos válidos: " + totalVotosValidos);
        if (totalVotosValidos > 0) {
            double percentualA = (double) votosA / totalVotosValidos * 100;
            double percentualB = (double) votosB / totalVotosValidos * 100;
            double percentualC = (double) votosC / totalVotosValidos * 100;
            double percentualD = (double) votosD / totalVotosValidos * 100;
            System.out.println("Percentual de votos para o candidato A: " + percentualA + "%");
            System.out.println("Percentual de votos para o candidato B: " + percentualB + "%");
            System.out.println("Percentual de votos para o candidato C: " + percentualC + "%");
            System.out.println("Percentual de votos para o candidato D: " + percentualD + "%");
        }
    }
}
