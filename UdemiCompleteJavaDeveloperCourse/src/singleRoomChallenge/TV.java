package singleRoomChallenge;

public class TV {
    private String model;
    private String manufacturer;
    private Dimensions tvDimensions;

    public TV(String model, String manufacturer, Dimensions tvDimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.tvDimensions = tvDimensions;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions gettvDimensions() {
        return tvDimensions;
    }
}


