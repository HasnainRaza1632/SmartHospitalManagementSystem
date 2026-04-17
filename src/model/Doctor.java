package model;

import interfaces.*;

import java.util.ArrayList;
import java.util.PriorityQueue;


public class Doctor extends MedicalStaff implements Schedulable, Notifiable {

    private String specialization;
    private String licenseNumber;
    private ArrayList<Patient> patients;
    private PriorityQueue<Appointment> appointments;

    public Doctor(String id, String name, int age, String contactNumber,
                  String staffId, String department, double salary, String shiftSchedule,
                  String specialization, String licenseNumber) {
        super(id, name, age, contactNumber, staffId, department, salary, shiftSchedule);
        this.patients = new ArrayList<>();
        this.appointments = new PriorityQueue<>();
        this.specialization = specialization;
        this.licenseNumber = licenseNumber;
    }

    public void treat(Patient patient) {}

    public void scheduleAppointment() {}

    public void cancelAppointment() {}

    public void sendAlert(String message) {}

    public void sendNotification() {}

    public void generateReport() {}

    public void getDetails() {}
}