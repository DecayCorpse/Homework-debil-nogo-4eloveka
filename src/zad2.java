import java.util.Random;

public class zad2 {
    public static void main(String[] args) {
        int n = 4;
        int[] c = new int[n];
        int[][] a = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("/////////////////////////");
        for (int i = 0; i < n; i++) {
            c[i] = a[i][0];
        }
        for (int i = 0; i < n; i++) {
            a[i][0] = a[i][n - 1];
        }
        for (int i = 0; i < n; i++) {
            a[i][n - 1] = c[i];
        }
        //////////////////////////////////////////////////////
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

