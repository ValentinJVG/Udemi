package sortedArray;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        int[] arrayOfInt = getIntegers(5);
        int[] sorted = sortIntegers(arrayOfInt);
        printArray(sorted);
    }

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill the array: \r");
        int[] arrayOfIntegers = new int[size];
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            arrayOfIntegers[i] = scanner.nextInt();
        }
        scanner.close();
        return arrayOfIntegers;
    }

    public static void printArray(int[] arrayOfInt) {
        for (int j = 0; j < arrayOfInt.length; j++) {
            System.out.println("Element " + j + " contents " + arrayOfInt[j]);
        }
    }


    public static int[] sortIntegers(int[] arrayOfInt) {
        int[] tempArray = new int[arrayOfInt.length];
        System.arraycopy(arrayOfInt, 0, tempArray, 0, arrayOfInt.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < tempArray.length - 1; i++) {
                if (tempArray[i] < tempArray[i + 1]) {
                    temp = tempArray[i];
                    tempArray[i] = tempArray[i + 1];
                    tempArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return tempArray;
    }
}

