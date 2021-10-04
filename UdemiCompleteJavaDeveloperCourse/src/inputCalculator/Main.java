package inputCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0L;
        int counter = 0;
        while (true){
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                sum += input;
                counter++;
                average = Math.round((double) sum / counter);

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}

