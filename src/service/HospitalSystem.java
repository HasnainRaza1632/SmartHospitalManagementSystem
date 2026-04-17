package service;

import model.*;
import java.util.*;

public class HospitalSystem {

    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Room> rooms;
    private HashMap<Doctor, ArrayList<Patient>> doctorMap;

    public HospitalSystem() {}

    public void admitPatient(Patient patient, Doctor doctor) {}

    public void dischargePatient(Patient patient) {}

    public Room allocateBed() {
        return null;
    }

    public void scheduleAppointment(Doctor doctor, Patient patient,
                                    String date, int priority) {}

    public void generateBillForPatient(Patient patient,
                                       double roomCharges,
                                       double medicineCharges,
                                       double consultationFee) {}
}