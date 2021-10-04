package singleRoomChallenge;

public class Door {
    private String model;
    private String manufacturer;
    private Dimensions doorDimensions;

    public Door(String model, String manufacturer, Dimensions doorDimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.doorDimensions = doorDimensions;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getDoorDimension() {
        return doorDimensions;
    }

    public void openTheDoor() {
        System.out.println("Opening the door");
    }
}

