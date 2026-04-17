package model;

public class Appointment implements Comparable<Appointment> {

    private String appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private int priority;

    public Appointment(String appointmentId, Patient patient, Doctor doctor,
                       String date, int priority) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.priority = priority;
    }
    //getters
    public String getAppointmentId(){return appointmentId;}
    public Patient getPatient(){return patient;}
    public Doctor getDoctor(){return doctor;}
    public String getDate(){return date;}
    public int getPriority(){return priority;}

    //setters
    public void setAppointmentId(String appointmentId){
        this.appointmentId = appointmentId;
    }

    public void setPatient(Patient patient){
        this.patient = patient;
    }

    public void setDoctor(Doctor  doctor){
        this.doctor = doctor;
    }

    public void setDate(String date){
        this.date=date;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void getDetails() {
        System.out.println("===== Appointment =====");
        System.out.println("  Appointment ID : "+this.appointmentId);
        System.out.println("  Patient : "+patient.name);
        System.out.println("  Doctor : "+doctor.name);
        System.out.println("  Date : "+date);
        System.out.println("  Doctor Priority Nubmer : "+ priority);
    }

    public int compareTo(Appointment o) {
        return this.getPriority() - o.getPriority();
    }
}