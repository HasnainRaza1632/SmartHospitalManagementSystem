package model;

import interfaces.Notifiable;
import java.util.*;

public class Nurse extends MedicalStaff implements Notifiable {

    private String nurseId;
    private String ward;
    private ArrayList<Patient> assignedPatients;

    public Nurse(String id, String name, int age, String contactNumber,
                 String staffId, String department, double salary, String shiftSchedule,
                 String nurseId, String ward) {
        super(id, name, age, contactNumber, staffId, department, salary, shiftSchedule);
    }

    public void treat() {}

    public void sendAlert(String message) {}

    public void sendNotification() {}

    public void generateReport() {}

    public void getDetails() {}
}