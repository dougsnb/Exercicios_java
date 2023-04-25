public class ex2 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int num = 10;

        for (int i = 0; i < A.length; i++) {
            A[i] = num;
            num += 10;
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}