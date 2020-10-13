package ru.mirea.prac11;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ArrayQueueModule {
    private static List<Object> queue = new ArrayList<>();

    // Предусловие - входящий элемент не нулевой
    // Постусловие - добавление элемента в очередь
    public static boolean enqueue(Object element){
        assert element != null;
        return queue.add(element);
    }

    // Предусловие - очередь не пуста
    // Постусловие - возвращение ненулевого элемента
    public static Object element(){
        assert !queue.isEmpty();
        return queue.get(0);
    }

    // Предусловие - очередь не пуста
    // Постусловие - удаление элемента и его возвращение
    public static Object dequeue(){
        assert !queue.isEmpty();
        Object temp = queue.get(0);
        queue.remove(0);
        return temp;
    }

    public static int size(){
        return queue.size();
    }

    public static boolean isEmpty(){
        return queue.isEmpty();
    }

    public static void clear(){
        queue.clear();
    }

    public static String StringValue() {
        return "ArrayQueueModule: " + queue;
    }
}
