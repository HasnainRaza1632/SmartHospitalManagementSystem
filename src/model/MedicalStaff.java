package model;

public abstract class MedicalStaff extends Person {

    protected String staffId;
    protected String department;
    protected double salary;
    protected String shiftSchedule;

    public MedicalStaff(String id, String name, int age, String contactNumber,
                        String staffId, String department, double salary, String shiftSchedule) {
        super(id, name, age, contactNumber);
    }

    public abstract void treat();
}