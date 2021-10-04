public class Main {

    public static void main(String[] args) {
	byte firstByte = 10;
	short firstShort = 20;
	int firstInt = 50;
	long firstLong = 50_000L + 10L * (firstByte + firstShort + firstInt);
        System.out.println(firstLong);
    }
}
