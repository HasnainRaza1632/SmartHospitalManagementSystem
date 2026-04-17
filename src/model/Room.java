package model;

public class Room {

    private String roomNumber;
    private String roomType;
    private boolean isOccupied;
    private double dailyCharge;

    public Room(String roomNumber, String roomType, boolean isOccupied, double dailyCharge) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isOccupied = isOccupied;
        this.dailyCharge = dailyCharge;
    }

    public String getRoomNumber(){return this.roomNumber;}

    public void allocate() {}

    public void vacate() {}
}