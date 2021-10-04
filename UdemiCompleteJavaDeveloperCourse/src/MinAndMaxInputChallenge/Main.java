package MinAndMaxInputChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number: ");
            if (scanner.hasNextInt()) {
                int userInput = scanner.nextInt();
                if (userInput > max) {
                    max = userInput;
                }
                if (userInput < min) {
                    min = userInput;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Minimum number is " + min);
        System.out.println("Maximum number is " + max);
        scanner.close();
    }
}
