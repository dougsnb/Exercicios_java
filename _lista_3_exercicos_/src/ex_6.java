public class ex_6 {

        public static void main(String[] args) {

            int numC = 0,numI = 100,
                    div;

            while (numC <= 50) {

                int dividers = 0;

                for (int contador = numI; contador >= 1; contador--) {
                    div = numI % contador;

                    if (div == 0) {
                        dividers++;
                    }

                }

                if(dividers == 2) {
                    System.out.println(numI);
                    numC++;
                }

                numI++;

            }


        }
    }

