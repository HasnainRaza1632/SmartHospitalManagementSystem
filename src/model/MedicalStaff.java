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
    //gettters and setters

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getShiftSchedule() {
        return shiftSchedule;
    }

    public void setShiftSchedule(String shiftSchedule) {
        this.shiftSchedule = shiftSchedule;
    }

    public abstract void treat(Patient patient);
}