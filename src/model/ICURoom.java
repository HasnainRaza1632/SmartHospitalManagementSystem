package model;

public class ICURoom extends Room {

    private boolean ventilatorAvailable;
    private boolean monitorAvailable;
    private double criticalCharge;

    public ICURoom(String roomNumber, String roomType, boolean isOccupied, double dailyCharge,
                   boolean ventilatorAvailable, boolean monitorAvailable, double criticalCharge) {
        super(roomNumber, roomType, dailyCharge);
        this.criticalCharge = criticalCharge;
        this.monitorAvailable = monitorAvailable;
        this.ventilatorAvailable = ventilatorAvailable;
    }

    @Override
    public void allocate() {
        if(!isOccupied){
            isOccupied = true;
            System.out.println("Emergency Room " + getRoomNumber() + " allocated successfully.");
            return;
        }
        System.out.println("Emergency Room " + getRoomNumber() + " is already occupied");
    }

    public void triggerEmergencyAlert() {
        System.out.println("Emergency alert in ICU room " + getRoomNumber());
    }

    public void vacate() {
        if(isOccupied){
            isOccupied = false;
            System.out.println("Room "+ getRoomNumber() + " has been vacated.");
            return;
        }
        System.out.println("Room " + getRoomNumber() + " is already empty.");
    }

}