package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayToList<T> {
    private ArrayList<T> list;

    public ArrayToList() {
        list = new ArrayList<>();
    }

    //Метод перевода массива значение в ArrayList
    public ArrayList<T> convert(T[] arr){
        list.addAll(Arrays.asList(arr));
        return list;
    }
}

