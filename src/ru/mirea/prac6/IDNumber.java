package ru.mirea.prac6;

import java.util.Arrays;

public class IDNumber {
    private Student[] students;
    int num;

    public IDNumber(int size) {
        students = new Student[size];
        num = 0;
    }

    public void add(Student student){
        students[num] = student;
        num++;
    }

    public void sort(){
        for (int left = 0; left < students.length; left++) {
            Student value = students[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.getId() < students[i].getId()) {
                    students[i + 1] = students[i];
                } else {
                    break;
                }
            }
            students[i + 1] = value;
        }
    }

    @Override
    public String toString() {
        return "IDNumber: " +
                Arrays.toString(students);
    }
}
