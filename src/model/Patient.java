package model;

public class Patient extends Person {

    private String patientId;
    private String diagnosis;
    private boolean isEmergency;
    private Room assignedRoom;
    private Bill bill;

    public Patient(String id, String name, int age, String contactNumber,
                   String patientId, String diagnosis, boolean isEmergency) {
        super(id, name, age, contactNumber);
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.isEmergency = isEmergency;
    }

    public void getDetails() {
        System.out.println("---- Patient Details ----");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("isEmergency: " + isEmergency);
        System.out.println("Assigned Room: " + assignedRoom.getRoomNumber() );
        System.out.println("Bill Amount: " + bill.calculateBill());
    }

    public void admit() {

    }

    public void discharge() {}
}