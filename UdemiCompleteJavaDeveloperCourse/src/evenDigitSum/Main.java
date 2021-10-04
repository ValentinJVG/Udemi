package evenDigitSum;

public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));

    }
    public static int getEvenDigitSum(int number) {
        int sumOfEven = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            int remainder = number % 10;
            number /= 10;
            if (remainder % 2 == 0) {
                sumOfEven += remainder;
            }
        }
        return sumOfEven;
    }
}
