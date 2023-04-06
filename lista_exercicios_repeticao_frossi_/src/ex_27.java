import java.util.Scanner;

public class ex_27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int votosA = 0, votosB = 0, votosC = 0, votosD = 0, votosNulos = 0, votosBrancos = 0, votantes, abstencoes;
        double percA, percB, percC, percD, percValidos, percAbstencao, totalVotos;
        int voto;

        do {
            System.out.println("Digite o código do candidato (1 a 4), 5 para nulo, 6 para branco, ou 0 para encerrar:");
            voto = sc.nextInt();

            if (voto == 1) {
                votosA++;
            } else if (voto == 2) {
                votosB++;
            } else if (voto == 3) {
                votosC++;
            } else if (voto == 4) {
                votosD++;
            } else if (voto == 5) {
                votosNulos++;
            } else if (voto == 6) {
                votosBrancos++;
            }

        } while (voto != 0);

        System.out.println("Digite o número de votantes:");
        votantes = sc.nextInt();

        System.out.println("Digite o número de abstenções:");
        abstencoes = sc.nextInt();

        totalVotos = votosA + votosB + votosC + votosD + votosNulos + votosBrancos;
        percA = (votosA / totalVotos) * 100;
        percB = (votosB / totalVotos) * 100;
        percC = (votosC / totalVotos) * 100;
        percD = (votosD / totalVotos) * 100;
        percValidos = ((votosA + votosB + votosC + votosD) / totalVotos) * 100;
        percAbstencao = (abstencoes / (abstencoes + votantes)) * 100;

        System.out.println("Total de votos para o candidato A: " + votosA);
        System.out.println("Total de votos para o candidato B: " + votosB);
        System.out.println("Total de votos para o candidato C: " + votosC);
        System.out.println("Total de votos para o candidato D: " + votosD);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBrancos);
        System.out.println("Percentual de votos para o candidato A: " + percA + "%");
        System.out.println("Percentual de votos para o candidato B: " + percB + "%");
        System.out.println("Percentual de votos para o candidato C: " + percC + "%");
        System.out.println("Percentual de votos para o candidato D: " + percD + "%");
        System.out.println("Percentual de votos válidos: " + percValidos + "%");
        System.out.println("Percentual de abstenções: " + percAbstencao + "%");

        sc.close();
    }

}

