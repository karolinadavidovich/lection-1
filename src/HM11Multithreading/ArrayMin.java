package HM11Multithreading;

import java.util.Scanner;

public class ArrayMin implements Runnable {
    public void run() {
        System.out.println("Min digit in array: " + arrayMin());
    }


    public static int arrayMin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length?");
        int arrayLength = scanner.nextInt();
        int[] array1 = new int[arrayLength];
        System.out.println("Array?");
        for (int i = 0; i < arrayLength; i++) {
            array1[i] = scanner.nextInt();
        }
        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        return min;
    }
}