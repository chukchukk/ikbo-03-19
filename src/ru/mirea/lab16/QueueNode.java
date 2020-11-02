package ru.mirea.lab16;


public class QueueNode {
    QueueNode next;
    QueueNode prev;
    Order value;

    public QueueNode(QueueNode prev, Order value, QueueNode next) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

}
