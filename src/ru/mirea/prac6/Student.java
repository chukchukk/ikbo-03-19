package ru.mirea.prac6;

public class Student {
    private int id;
    private int gpa;
    private String name;

    public Student(int id, int gpa, String name) {
        this.id = id;
        this.gpa = gpa;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student " + name + ": id = " + id + ", gpa = " + gpa + "\\";
    }
}
