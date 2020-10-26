package ru.mirea.prac16;

import java.util.Collection;

public class OrderList {
    private Node front;
    private int size;

    public OrderList() {
        front = null;
        size = 0;
    }

    public OrderList(Collection<Item> collection){
        addAll(collection);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean addEnd(Item item) {
        if(item == null)
            return false;
        if (isEmpty())
            front = new Node(item);
        else {
            Node temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(temp, item, null);
        }
        size++;
        return true;
    }

    private void addAll(Collection<Item> collection){
        for(Item item:collection){
            if(item != null)
                addEnd(item);
        }
    }

    public boolean remove(Item item) {
        if (isEmpty())
            return false;

        if (front.item.equals(item)) {
            front = front.next;
            size--;
            return true;
        }

        Node current = front;

        while (current != null && !current.item.equals(item))
            current = current.next;

        if (current == null)
            return false;

        if (current.next != null)
            current.next.prev = current.prev;

        current.prev.next = current.next;

        size--;
        return true;
    }

    public Item[] toArray(){
        Item[] items = new Item[size];
        int i = 0;

        for (Node node = front; node != null; node = node.next) {
            items[i++] = node.item;
        }

        return items;
    }
}

class Node{
    Node next, prev;
    Item item;

    public Node(Node prev, Item item, Node next) {
        this.next = next;
        this.prev = prev;
        this.item = item;
    }

    public Node(Item item){
        this(null, item, null);
    }
}