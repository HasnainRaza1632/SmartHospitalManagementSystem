package model;

public class Appointment implements Comparable<Appointment> {

    private String appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private int priority;

    public Appointment(String appointmentId, Patient patient, Doctor doctor,
                       String date, int priority) {}

    public void getDetails() {}

    public int compareTo(Appointment o) {
        return 0;
    }
}