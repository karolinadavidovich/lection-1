package HM11Multithreading;

import java.util.Scanner;

public class ArrayMax implements Runnable {
    public void run() {
        System.out.println("Max digit in array: " + arrayMax());
    }


    public static int arrayMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length?");
        int arrayLength = scanner.nextInt();
        int[] array1 = new int[arrayLength];
        System.out.println("Array?");
        for (int i = 0; i < arrayLength; i++) {
            array1[i] = scanner.nextInt();
        }
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            }
        }
        return max;
    }
}

