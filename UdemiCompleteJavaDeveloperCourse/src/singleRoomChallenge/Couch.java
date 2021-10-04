package singleRoomChallenge;

import java.awt.*;

public class Couch {
    private String model;
    private String manufacturer;
private Dimensions couchDimensions;

    public Couch(String model, String manufacturer, Dimensions couchDimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.couchDimensions = couchDimensions;

    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getDimensions() {
        return couchDimensions;
    }
}
