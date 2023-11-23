package ru.hse.german;

public class Student {
    private final String firstName;
    private final String lastName;
    public Student(final String name, final String lastname) {
        firstName = name;
        lastName = lastname;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
