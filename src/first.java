import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        int[] array1 = {5, 3, 13, 25, 23};
        int[] array2 = {2, 77, 26, 24, 55};
        int bothArrays = array1.length + array2.length;
        int[] mergingArrays = new int[bothArrays];
        for (int i = 0; i < array1.length; i = i + 1) {
            mergingArrays[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i = i + 1) {
            mergingArrays[i + array1.length] = array2[i];
        }
        for (int i = 0; i < bothArrays; i = i + 1) {
            Arrays.sort(mergingArrays);
            System.out.print(mergingArrays[i] + "\t");
        }
    }
}