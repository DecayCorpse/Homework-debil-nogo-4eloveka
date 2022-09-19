import java.util.Random;

public class zad6 {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] a = new int[5][5];
        int diagonal = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = random.nextInt(10);
                System.out.print(a[i][j] + " ");
            }
          diagonal = diagonal + a[i][i];
            System.out.println();
        }
        System.out.println("summa po diagonali =" + diagonal);
    }
}
