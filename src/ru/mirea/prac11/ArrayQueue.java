package ru.mirea.prac11;

import java.util.ArrayList;
import java.util.List;

public class ArrayQueue<E> implements Queue<E> {
    private List<E> queue;
    private int size;

    public ArrayQueue() {
        queue = new ArrayList<>();
        size = 0;
    }

    // Предусловие - входящий элемент не нулевой
    // Постусловие - добавление элемента в очередь
    public boolean enqueue(E element){
        assert element != null;
        size++;
        return queue.add(element);
    }

    // Предусловие - очередь не пуста
    // Постусловие - возвращение ненулевого элемента
    public E element(){
        assert !queue.isEmpty();
        return queue.get(0);
    }

    // Предусловие - очередь не пуста
    // Постусловие - удаление элемента и его возвращение
    public E dequeue(){
        assert !queue.isEmpty();
        E temp = queue.get(0);
        queue.remove(0);
        size--;
        return temp;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void clear(){
        queue.clear();
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "queue=" + queue +
                '}';
    }
}