public class shahmatiKon {
    public static void main(String[] args) {
        int cordI = 3;
        int cordJ = 4;
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
        a[cordI][cordJ] = "♞";


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (Math.abs(cordI - i) == 1 && Math.abs(cordJ - j) == 2) {
                    a[i][j] = "\uD83C\uDD67";
                }
                if (Math.abs(cordI - i) == 2 && Math.abs(cordJ - j) == 1) {
                    a[i][j] = "\uD83C\uDD67";

                }
                    System.out.print(a[i][j] + "  ");


            }

            System.out.println();
        }
    }
}

