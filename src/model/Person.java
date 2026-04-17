package model;

public abstract class Person {
    protected String id;
    protected String name;
    protected int age;
    protected String contactNumber;

    public Person(String id, String name, int age, String contactNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
    }

    public abstract void getDetails();
}