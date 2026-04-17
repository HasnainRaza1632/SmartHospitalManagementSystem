package filehandling;

import model.Patient;
import java.util.*;

public class PatientFileHandler extends FileManager {

    public PatientFileHandler(String filePath) {
        super(filePath);
    }

    public void savePatient(Patient patient) {}

    public List<Patient> loadPatients() {
        return null;
    }
}