import java.util.Arrays;

public class second {
    public static void main(String[] args) {
        int[] array = {1, 4, 25, 5, 17, 13, 25, 5, 88, 100, 1};
        System.out.println("Original array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        System.out.println("Array after removing duplicates:");
        array = Arrays.stream(array).distinct().toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}

