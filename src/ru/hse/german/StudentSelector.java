package ru.hse.german;


import ru.hse.german.Student;

import java.util.Random;
public class StudentSelector{
    private final Student[] student;
    private Random random = new Random();

    public StudentSelector(final Student[] students){
        student = students;
    }
    int count(){
        return student.length;
    }
    boolean hasStudents(){
        return this.count() > 0;
    }
    Student nextRandomStudent(){
        if(this.hasStudents()) return student[random.nextInt(0, student.length)];
        else return null;
    }
}
