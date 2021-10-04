package singleRoomChallenge;

import java.awt.*;

public class Stool {
    private String model;
    private String manufacturer;
    private Dimensions stoolDimensions;

    public Stool(String model, String manufacturer, Dimensions stoolDimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.stoolDimensions = stoolDimensions;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getStoolDimensions() {
        return stoolDimensions;
    }
}

