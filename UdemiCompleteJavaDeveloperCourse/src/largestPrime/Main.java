package largestPrime;

public class Main {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
    }
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        } else {
            for (int i = number / 2; i >= 2; i--) {
                if (number % i == 0) {
                    number = i;
                }
            }
        }
        return number;
    }
}
