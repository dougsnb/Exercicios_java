public class ex6 {
    public static void main(String[] args) {
        int[] vetor = { 1, -2, 3, 4, -5, 6, 0, 7, -8, 9, -10, 11, -12, 13, 14, -15, 16, -17, 18, 19, -20, 21, 22, 23,
                -24, 25, 26, -27, 28, 29 };
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                System.out.println("O número " + vetor[i] + " está na posição " + (i + 1));
            }
        }
    }
}