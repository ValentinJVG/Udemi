package inheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(15_000);
        sedan.accelerate(30);
        sedan.steer(40);
        sedan.accelerate(20);
        sedan.accelerate(100);
        sedan.accelerate(-150);
    }
}
