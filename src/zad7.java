import java.util.Random;

public class zad7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] a = new int[7][4];
        int max = 0;
        int index = 0;
        int index1 = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = random.nextInt(100);
                System.out.print(a[i][j] + " ");
                if (max < a[i][j]) {
                    max = a[i][j];
                    index = i + 1;
                    index1 = j + 1;

                }

            }
            System.out.println();

        }
        System.out.println("max = " + max);
        System.out.println("stroka - " + index );
        System.out.println("ryad - " + index1);

    }
}
