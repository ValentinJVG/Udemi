package inheritanceChallenge;

public class Vehicle {
    private String name;
    private int weight;
    private int currentSpeed;
    private int currentDirection;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public Vehicle(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Steering at " + direction + " angle");
    }

    public void move(int speed, int direction) {
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("Moving at " + currentSpeed + " in direction " + currentDirection);
    }

    public void stop() {
        this.currentSpeed = 0;
    }
}
