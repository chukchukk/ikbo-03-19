package ru.mirea.lab1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FourthExample {
    static int size;
    static int arr[];

    public static void main(String[] args) {
        initialize();
        printAndSortArr();
    }

    public static void initialize(){
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        arr = new int[size];
        for(int i = 0; i < size; i++)
            arr[i] =new Random().nextInt(100);
    }

    public static void printAndSortArr(){
        System.out.println("Неотсортированный массив:");
        for(int i = 0; i < size; i++)
            System.out.println(arr[i]);

        System.out.println();

        System.out.println("Отсортированный массив");
        Arrays.stream(arr).sorted().forEach(System.out::println);
    }
}