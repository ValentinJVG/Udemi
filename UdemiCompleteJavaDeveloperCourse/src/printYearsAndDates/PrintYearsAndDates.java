package printYearsAndDates;

public class PrintYearsAndDates {
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = (minutes / 60 / 24) % 365;
            long year = minutes / 60 / 24 / 365;
            System.out.println(minutes + " min = " + year + " y and " + days + " d");
        }
    }
}