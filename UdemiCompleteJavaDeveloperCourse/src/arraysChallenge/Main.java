package arraysChallenge;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrayOfInt = getIntegers(5);
        int[] sorted = sortArray(arrayOfInt);
        printArray(sorted);
    }

    public static int[] getIntegers(int size) {
        System.out.println("Fill the array: \r");
        int[] arrayOfInt = new int[size];
        for (int i = 0; i < arrayOfInt.length; i++) {
            arrayOfInt[i] = scanner.nextInt();
        }
        return arrayOfInt;
    }

    public static void printArray(int[] arrayOfInt) {
        for (int j : arrayOfInt) {
            System.out.print(j + " ");
        }
    }


    public static int[] sortArray(int[] arrayOfInt) {
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
