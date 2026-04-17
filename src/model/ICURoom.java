package model;

public class ICURoom extends Room {

    private boolean ventilatorAvailable;
    private boolean monitorAvailable;
    private double criticalCharge;

    public ICURoom(String roomNumber, String roomType, boolean isOccupied, double dailyCharge,
                   boolean ventilatorAvailable, boolean monitorAvailable, double criticalCharge) {
        super(roomNumber, roomType, isOccupied, dailyCharge);
    }

    public void allocate() {}

    public void triggerEmergencyAlert() {}

    public void vacate() {}
}