package ru.mirea.prac11;

public interface Queue<E> {
    public boolean enqueue(E e);
    public E element();
    public E dequeue();
    public int size();
    public boolean isEmpty();
    public void clear();
}
