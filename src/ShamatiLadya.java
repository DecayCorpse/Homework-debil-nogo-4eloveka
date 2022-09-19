public class ShamatiLadya {
    public static void main(String[] args) {
        int cordI = 2;
        int cordJ = 1;
        String a[][] = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                a[i][j] = "w";

                if (i % 2 == 0 && j % 2 == 0) {
                    a[i][j] = "w";
                }
                if (i % 2 == 0 && j % 2 != 0) {
                    a[i][j] = "b";

                }
                if (i % 2 != 0 && j % 2 != 0) {
                    a[i][j] = "W";
                }
                if (i % 2 != 0 && j % 2 == 0) {
                    a[i][j] = "b";

                }
            }
        }
        a[cordI][cordJ] = "♜";
            System.out.println();


        }
    }

