public class ex1 {
    public static void main(String[] args) {
        int[] x = new int[10];

        for (int i = 0; i < x.length; i++) {
            x[i] = 30;
        }

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

}