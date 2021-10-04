package singleRoomChallenge;

import java.awt.*;

public class Table {private String model;
    private String manufacturer;
    private Dimensions tableDimensions;


    public Table(String model, String manufacturer, Dimensions tableDimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.tableDimensions = tableDimensions;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getTableDimensions() {
        return tableDimensions;
    }
}

