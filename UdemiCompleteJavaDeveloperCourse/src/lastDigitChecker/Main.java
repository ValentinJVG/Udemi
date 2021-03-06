package lastDigitChecker;

public class Main {
    public static boolean hasSameLastDigit (int a, int b, int c) {
        if ((a < 10 || a > 1000) || (b < 10 || b > 1000) || (c < 10 || c > 1000)) {
            return false;
        } else {
            return (a % 10 == b % 10) || ( a % 10 == c % 10) || (b % 10 == c % 10);
        }
    }
    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
