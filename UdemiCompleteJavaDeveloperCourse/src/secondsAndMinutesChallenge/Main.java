package secondsAndMinutesChallenge;
public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        int hour = minutes / 60;
        minutes = minutes % 60;
        return hour + "h " + minutes + "m " + seconds + "s";
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {

            return "Invalid value";
        }
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }
}

