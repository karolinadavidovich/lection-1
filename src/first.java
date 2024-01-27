import java.util.Arrays;
public class first {
    public static void main(String[] args) {
        int[][] multidimensionalArray = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                multidimensionalArray[i][j] = 2 * i + j;
            }
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(multidimensionalArray[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                int array = multidimensionalArray[i][j];
                multidimensionalArray[i][j] = multidimensionalArray[j][i];
                multidimensionalArray[j][i] = array;
            }
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d", multidimensionalArray[i][j]);
            }
            System.out.println();
        }
    }
}