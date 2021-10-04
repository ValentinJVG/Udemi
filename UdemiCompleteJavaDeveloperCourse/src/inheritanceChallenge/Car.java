package inheritanceChallenge;

public class Car extends Vehicle {
    private int doors;
    private String colour;
    private boolean isManual;

    private int currentGear;

    public Car(String name, int weight, int doors, String colour, boolean isManual) {
        super(name, weight);
        this.doors = doors;
        this.colour = colour;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Gear changed to " + this.currentGear + "gear");
    }

    public void changeSpeed(int speed, int direction) {
        move(speed, direction);
        System.out.println("Speed is " + speed + " direction " + direction);
    }
}
