package ru.mirea.lab16;


public class ListNode {
    MenuItem value;
    ListNode next;

    public ListNode(MenuItem value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public MenuItem getValue() {
        return value;
    }

    public void setValue(MenuItem value) {
        this.value = value;
    }
}
