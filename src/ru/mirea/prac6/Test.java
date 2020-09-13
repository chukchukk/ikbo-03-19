package ru.mirea.prac6;

import java.util.Arrays;
import java.util.Random;

public class Test {
    private final static int SIZE = 5;
    public static void main(String[] args) {
        System.out.println("Задание №1: ");
        IDNumber idNumber = new IDNumber(SIZE);
        for(int i = 0; i < SIZE; i++)
        {
            idNumber.add(makeStudent(i));
        }
        idNumber.sort();
        System.out.println("Отсортированный по ID список студентов: ");
        System.out.println(idNumber);

        System.out.println("Задание №2: ");
        Student[] students = new Student[SIZE];
        for(int i = 0; i < SIZE; i++){
            students[i] = makeStudent(i);
        }
        System.out.println("Изначальный массив: " + Arrays.toString(students));
        Arrays.sort(students,new SortingStudentsByGPA());
        System.out.println("Отсортированный массив: " + Arrays.toString(students));

        System.out.println("Задание №3: ");
        Student[] student1 = new Student[SIZE];
        Student[] student2 = new Student[SIZE];

        for(int i = 0; i < SIZE; i++){
            student1[i] = makeStudent(i);
            student2[i] = makeStudent(i+10);
        }
        Arrays.sort(student1,new SortingStudentsByGPA());
        Arrays.sort(student2, new SortingStudentsByGPA());

        System.out.println("Первый отсортированный массив студентов: " + Arrays.toString(student1));
        System.out.println("Второй отсортированный массив студентов: " + Arrays.toString(student2));

        System.out.println("Объединенный массив: " + Arrays.toString(mergeSort(student1,student2)));
    }

    public static Student makeStudent(int i){
        return new Student(new Random().nextInt(50),new Random().nextInt(15), "name" + i);
    }

    public static Student[] mergeSort(Student[] arr1, Student[] arr2){
        Student[] arr3 = new Student[arr1.length + arr2.length];
        int i=0, j=0;   //i отвечает за arr1, j - за arr2

        for (int k=0; k<arr3.length; k++) {
            
            if (i > arr1.length-1) {
                Student student = arr2[j];
                arr3[k] = student;
                j++;
            }
            else if (j > arr2.length-1) {
                Student student = arr1[i];
                arr3[k] = student;
                i++;
            }
            else if (arr1[i].getGpa() < arr2[j].getGpa()) {
                Student student = arr1[i];
                arr3[k] = student;
                i++;
            }
            else {
                Student student = arr2[j];
                arr3[k] = student;
                j++;
            }
        }
        return arr3;
    }
}
