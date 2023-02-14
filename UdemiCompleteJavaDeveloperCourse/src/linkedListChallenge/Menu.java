package linkedListChallenge;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void printMenu() {
        System.out.println("Press \"p\" to play\n" +
                "Press \"f\" to forward to the next song\n" +
                "Press \"b\" to skip backwards to the previous song\n" +
                "Press \"r\" to replay this song\n" +
                "Press \"q\" to quit");
        menuChoice();
    }

    public static void menuChoice() {
        String choice = scanner.nextLine();
        while (!choice.equalsIgnoreCase("q")) {
            switch (choice.toLowerCase(Locale.ROOT)) {
                case "p":
                    PlayList.play();
                    break;
                case "f":
                    forward();
                    break;
                case "r":
                    repeat();
                case "b":
                    previousSong();
                    break;
            }
        }
    }


}
