package reverseArrayChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverse(array);

    }

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        Integer[] reversed = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[i];
        }
        Collections.reverse(Arrays.asList(reversed));
        System.out.println("Reversed array = " + Arrays.toString(reversed));
    }
}
