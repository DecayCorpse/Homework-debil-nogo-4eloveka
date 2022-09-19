import java.util.Random;

public class zad4 {
    public static void main(String[] args) {
        Random random = new Random();
        int summa = 0;
        int [][] a = new int[3][6];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                a[i][j] = random.nextInt(10);

                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
            for (int j = 0; j < 6; j++) {
                summa = 0;
                for (int i = 0; i < 3; i++) {
                summa = summa + a[i][j];
            }
            System.out.println("summa stolbca = " + summa);
        }


    }
}
