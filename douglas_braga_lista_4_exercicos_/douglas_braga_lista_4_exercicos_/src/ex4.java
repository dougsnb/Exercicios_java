public class ex4 {
    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int contPares = 0;

        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
            if (vetor[i] % 2 == 0) {
                contPares++;
            }
        }
        System.out.println("\nQuantidade de valores pares: " + contPares);
    }
}