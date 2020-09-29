package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.Scanner;

public class TestLab10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Для массива int-ов
        Integer []arrInt = new Integer[]{1,2,3,4,5};
        ArrayToList<Integer> arrayToList = new ArrayToList<>();
        ArrayList<Integer> list = arrayToList.convert(arrInt);

        System.out.println("List из массива int-ов: ");
        for(int element:list){
            System.out.print(element + " ");
        }

        //Для массива String-ов
        String [] arrString = new String[]{"one", "two", "three", "four", "five"};
        ArrayToList<String> arrayToList1 = new ArrayToList<>();
        ArrayList<String> list1 = arrayToList1.convert(arrString);

        System.out.println("\nList из массива String-ов: ");
        for(String el: list1){
            System.out.print(el + " ");
        }

        System.out.println("--------------------------------------");

        System.out.println("Тест класса, в котором хранится массив любых типов.");
        System.out.println("Заполните изначальный массив из 10 элементов (Integer): ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            arrayList.add(in.nextInt());
        }
        GenericArray<Integer> genericArray = new GenericArray<>(arrayList);

        System.out.print("Получение элемента по индексу 3: " + genericArray.getElemByIndex(3));
    }
}
