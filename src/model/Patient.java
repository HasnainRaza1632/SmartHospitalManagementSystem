package model;

public class Patient extends Person {

    private String patientId;
    private String diagnosis;
    private boolean isEmergency;
    private Room assignedRoom;
    private Prescription prescription;
    private Bill bill;

    public Patient(String id, String name, int age, String contactNumber,
                   String patientId, String diagnosis, boolean isEmergency) {
        super(id, name, age, contactNumber);
    }

    public void getDetails() {}

    public void admit() {}

    public void discharge() {}
}