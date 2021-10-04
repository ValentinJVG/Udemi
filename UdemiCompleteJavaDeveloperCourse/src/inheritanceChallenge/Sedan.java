package inheritanceChallenge;

public class Sedan extends Car {

    private int maintenanceInKm;

    public Sedan(int maintenanceInKm) {
        super("Sedan", 2500, 4, "red", false);
        this.maintenanceInKm = maintenanceInKm;
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;
        if (newSpeed == 0) {
            stop();
            changeGear(1);
        } else if (newSpeed > 0 && newSpeed <= 10) {
            changeGear(1);
        } else if (newSpeed > 10 && newSpeed <= 20) {
            changeGear(2);
        } else if (newSpeed > 20 && newSpeed <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
