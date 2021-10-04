package singleRoomChallenge;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Couch couch = new Couch("LayzeeBoy2000", "The best couches!", new Dimensions(4500, 500, 2500));
        Door door = new Door("White door", "Some manufacturer", new Dimensions(900, 2200, 80));
        TV tv = new TV("PUS437150", "Phillips", new Dimensions(1000, 800, 50));
        Table table = new Table("Dinning table", "Wood furniture", new Dimensions(2500, 900, 1500));
        Stool stool = new Stool(" Dinning stool", "Wood furniture", new Dimensions(600,1500, 600));
        Room room = new Room(door, stool, table, tv, couch);

        room.enterTheRoom();
        door.openTheDoor();

    }

}
