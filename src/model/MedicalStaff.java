package model;

public abstract class MedicalStaff extends Person {

    protected String staffId;
    protected String department;
    protected double salary;
    protected String shiftSchedule;

    public MedicalStaff(String id, String name, int age, String contactNumber,
                        String staffId, String department, double salary, String shiftSchedule) {
        super(id, name, age, contactNumber);
        this.staffId = staffId;
        this.department = department;
        this.salary = salary;
        this.shiftSchedule = shiftSchedule;
    }

    public abstract void treat(Patient patient);
}