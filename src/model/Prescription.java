package model;

import exceptions.InvalidPrescriptionException;
import java.util.*;

public class Prescription {

    private String prescriptionId;
    private ArrayList<String> medicines;
    private String dosage;
    private Doctor issuedBy;

    public Prescription(String prescriptionId, ArrayList<String> medicines,
                        String dosage, Doctor issuedBy) {}

    public boolean checkConflicts() throws InvalidPrescriptionException {
        return false;
    }

    public void displayPrescription() {}
}