package model;

public class Room {

    private String roomNumber;
    private String roomType;
    private boolean isOccupied;
    private double dailyCharge;

    public Room(String roomNumber, String roomType, double dailyCharge) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isOccupied = false;
        this.dailyCharge = dailyCharge;
    }

    public String getRoomNumber(){return this.roomNumber;}
    public String getRoomType(){return this.roomType;}
    public boolean isOccupied(){return this.isOccupied;}
    public double getDailyCharge(){return this.dailyCharge;}

    public void setDailyCharge(double dailyCharge){this.dailyCharge = dailyCharge;}

    public void allocate() {
        if(!isOccupied){
            isOccupied = true;
            System.out.println("Room " + roomNumber + " allocated successfully.");
            return;
        }
        System.out.println("Room " + roomNumber + " is already occupied");
    }

    public void vacate() {
        if(isOccupied){
            isOccupied = false;
            System.out.println("Room "+ roomNumber + " has been vacated.");
            return;
        }
        System.out.println("Room " + roomNumber + " is already empty.");
    }
}