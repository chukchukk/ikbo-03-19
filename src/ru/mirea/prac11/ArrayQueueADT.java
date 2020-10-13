package ru.mirea.prac11;

import java.util.ArrayList;
import java.util.List;

public class ArrayQueueADT{
    private List<Object> queue = new ArrayList<>();

    // Предусловие - element не null
    // Постусловие - добавление элемента и возврат boolean значения об успешности операции
    public static boolean enqueue(ArrayQueueADT queueADT, Object element){
        assert element != null;
        return queueADT.queue.add(element);
    }

    // Предусловие - очередь не пуста
    // Постусловие - возвращение ненулевого элемента
    public static Object element(ArrayQueueADT queueADT){
        assert !queueADT.queue.isEmpty();
        return queueADT.queue.get(0);
    }

    // Предусловие - очередь не пуста
    // Постусловие - удаление элемента и его возвращение
    public static Object dequeue(ArrayQueueADT queueADT){
        assert !queueADT.queue.isEmpty();
        Object temp = element(queueADT);
        queueADT.queue.remove(0);
        return temp;
    }

    public static int size(ArrayQueueADT queueADT){
        return queueADT.queue.size();
    }

    public static boolean isEmpty(ArrayQueueADT queueADT){
        return queueADT.queue.isEmpty();
    }

    public static void clear(ArrayQueueADT queueADT){
        queueADT.queue.clear();
    }

    @Override
    public String toString() {
        return "ArrayQueueADT{" +
                "queue=" + queue +
                '}';
    }
}
