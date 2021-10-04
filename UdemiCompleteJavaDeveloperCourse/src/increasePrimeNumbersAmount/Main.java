package increasePrimeNumbersAmount;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 300; i++ ) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);

                if (count == 10) {
                    break;
                }
            }
        }

    }
    public static boolean isPrime (int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        } return true;
    }
}

