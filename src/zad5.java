import java.util.Random;
public class zad5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] a = new int[4][8];
        int chetnayaSumm = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                a[i][j] = random.nextInt(10);
                if (a[i][j] % 2 == 0) {
                    chetnayaSumm = chetnayaSumm + a[i][j];
                }

                    System.out.print(a[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println(" symma vseh chetnih chisel massiva = " + chetnayaSumm);

    }
}
