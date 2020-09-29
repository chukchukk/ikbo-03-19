package ru.mirea.lab10;

import java.util.ArrayList;

public class GenericArray<T> {
    private ArrayList<T> arr;   //Использую ArrayList, так как не надо задумываться над вместимостью

    public GenericArray(ArrayList<T> arr) {
        this.arr = arr;
    }

    public T getElemByIndex(int index){
        if(index > arr.size())
            return null;
        return arr.get(index);
    }
}
