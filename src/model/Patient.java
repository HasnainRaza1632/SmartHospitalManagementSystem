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

    public String getPatientId(){return patientId;}
    public String getDiagnosis(){return diagnosis;}
    public boolean getisEmergency(){return isEmergency;}
    public String getAssignedRoom(){
        if(assignedRoom != null){
            return assignedRoom.getRoomNumber();
        }
        return "Not Assigned";
    }

    public double getBillAmount(){
        if(bill != null){
            return bill.calculateBill();
        }
        return 0.0;
    }

    public Room getRoomObject() { return assignedRoom; }
    public Bill getBillObject() { return bill; }

    public void setDiagnosis(String diagnosis){this.diagnosis = diagnosis;}
    public void setEmergency(boolean isEmergency){this.isEmergency = isEmergency;}
    public void setBill(Bill bill){
        this.bill = bill;
    }
    public void setAssignedRoom(Room room){this.assignedRoom = room;}

    public void getDetails() {
        System.out.println("===== Patient Details =====");
        System.out.println("  Patient ID: " + patientId);
        System.out.println("  name: " + name);
        System.out.println("  Age: " + age);
        System.out.println("  Diagnosis: " + diagnosis);
        System.out.println("  isEmergency: " + (isEmergency ? "Yes" : "No"));
        System.out.println("  Assigned Room: " + getAssignedRoom() );
        System.out.println("  Bill Amount: " + getBillAmount());
    }

    public void admit() {
        System.out.println("  Patient " + patientId + " admitted successfully.");
    }

    public void discharge() {
        if (assignedRoom != null) {
            assignedRoom.vacate();
            assignedRoom = null;
        }
        System.out.println("  Patient " + patientId + " discharged successfully.");
    }
}