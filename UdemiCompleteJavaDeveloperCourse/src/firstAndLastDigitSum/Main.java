package firstAndLastDigitSum;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastNumber = number % 10;
        while (number > 9) {
            number /= 10;
        }
        return lastNumber + number;
    }
}
