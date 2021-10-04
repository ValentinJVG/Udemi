package sharedDigit;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(19, 99));
    }

    public static boolean hasSharedDigit(int start, int end) {
        if (start < 10 || start > 99 || end < 10 || end > 99) {
            return false;
        } else {
            return (start / 10 == end / 10) || (start / 10 == end % 10) ||
                    (start % 10 == end / 10) || (start % 10 == end % 10);
        }
    }
}
