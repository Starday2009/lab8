import java.lang.*;
public class Arr1 {

    public void createArr() {
        double[] a = new double[51];
        for (int i = 1; i < 51; i++) {
            a[i] = (i * 2) - 1;
            // System.out.println(a[i] + "  ");
        }
        for (int i = a.length - 1; i > 0; i--) {
            System.out.println(a[i] + "  ");
        }
    }

    public void random() {
        int[] array;
        array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 12));
            System.out.print(array[i] + " ");

            for (i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) array[i] = 0;
                System.out.print(array[i] + " ");
            }
        }
    }

    public void dou() {

        int[][] arr = new int[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (int) (Math.random() * 91);
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void doudou() {
        int[][] arr = new int[8][5];
        int max = arr[0][0];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (int)(Math.random() * 199) - 99;
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max=" + max);
    }
}