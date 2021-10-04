package singleRoomChallenge;

public class Room {
    private Door door;
    private Stool stool;
    private Table table;
    private TV tv;
    private Couch couch;

    public Room(Door door, Stool stool, Table table, TV tv, Couch couch) {
        this.door = door;
        this.stool = stool;
        this.table = table;
        this.tv = tv;
        this.couch = couch;
    }

    public Door getDoor() {
        return door;
    }

    public Stool getStool() {
        return stool;
    }

    public Table getTable() {
        return table;
    }

    public TV getTv() {
        return tv;
    }

    public Couch getCouch() {
        return couch;
    }

    public void enterTheRoom() {
        System.out.println("Entering the room");
    }
}
