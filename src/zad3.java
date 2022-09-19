import java.util.Random;
public class zad3 {
    public static void main(String[] args) {
        int n = 3;
        int v = 7;
        int summ = 0;
        int index = 0;
        int max = 0;
        int[][] a = new int[n][v];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < v; j++) {
                a[i][j] = random.nextInt(10);
                summ = summ + a[i][j];
            }
            System.out.println(summ);
            if (summ > max) {
                max = summ;
                index = i;
            }
            summ = 0;
        }
        System.out.println("max = " + max);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();}
        System.out.println("stroka s naibolshim zna4eniem = " + index);
    }
}
