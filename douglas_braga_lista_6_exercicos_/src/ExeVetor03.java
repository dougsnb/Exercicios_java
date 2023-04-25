public class ExeVetor03 {
        public static void main(String[] args) {
            int[] B = preencheArray();
            System.out.print("B = ");
            imprimeArray(B);
        }

        public static int[] preencheArray() {
            int[] B = new int[10];
            for (int i = 0; i < B.length; i++) {
                if (i % 2 == 0) {
                    B[i] = 20;
                } else {
                    B[i] = 10;
                }
            }
            return B;
        }

        public static void imprimeArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
