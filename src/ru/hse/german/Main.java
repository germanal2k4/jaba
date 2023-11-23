package ru.hse.german;

import java.util.Scanner;

public class Main {

    static void unknownCommand() {
        System.out.println("Неизвестная команда");
    }

    static void exit() {
        System.out.println("До свидания!");
    }

    static void about() {
        System.out.println("Герман Альберштейн");
    }

    static void nextStudent(StudentSelector studentSelector) {
        Student student = studentSelector.nextRandomStudent();
        if (student != null) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        } else {
            System.out.println("студентов нет");
        }
    }

    static StudentSelector createNewStudentSelector() {
        Student[] students = {new Student("German", "Alb"), new Student("SDFsdf", "sdfdsf")};
        return new StudentSelector(students);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSelector selector = createNewStudentSelector();
        System.out.println("* next, чтобы узнать, кто пойдёт к доске");
        System.out.println("* about, чтобы узнать автора программы");
        System.out.println("* exit, чтобы выйти");
        System.out.println("Ваш выбор?");
        while (true) {
            String nextLine = scanner.nextLine();
            if (nextLine.equalsIgnoreCase("exit")) {
                exit();
                break;
            }
            else if (nextLine.equalsIgnoreCase("about")) {
                about();
            }
            else if (nextLine.equalsIgnoreCase("next")) {
                nextStudent(selector);
            } else {
                unknownCommand();
            }
            System.out.println("Введите «next», «remove <фамилия>», «about» или «exit»");
        }
    }
}
