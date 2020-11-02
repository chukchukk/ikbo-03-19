package ru.mirea.lab16;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InternetOrder implements Order {
    private int size = 0;
    private ListNode head, tail;
    private Customer customer;

    public InternetOrder(Customer customer) {
        this.customer = customer;
        head = null;
        tail = null;
    }


    @Override
    public boolean add(MenuItem item) {
        if(head == null){
            head = new ListNode(item, null);
            size++;
            return true;
        } else {
            ListNode temp = head;
            while (temp.next != null)
                temp = temp.next;

            if(temp == null)
                return false;
            else {
                temp.next = new ListNode(item, null);
                tail = temp.next;
                size++;
                return true;
            }
        }
    }

    @Override
    public String[] itemsNames() {
        ListNode temp = head;
        List<String> list = new ArrayList<>();

        while (temp != null){
            list.add(temp.value.getName());
            temp = temp.next;
        }

        return list.toArray(new String[0]);
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        ListNode temp = head;

        while (temp != null){
            if(temp.value.getName().equals(itemName))
                count++;
            temp = temp.next;
        }

        return count;
    }

    @Override
    public int itemsQuantity(MenuItem itemName) {
        int count = 0;
        ListNode temp = head;

        while (temp != null){
            if (temp.value.equals(itemName))
                count++;
            temp = temp.next;
        }

        return count;
    }

    @Override
    public MenuItem[] getItems() {
        List<MenuItem> list = new ArrayList<>();
        ListNode temp = head;

        while (temp != null){
            list.add(temp.value);
        }

        return list.toArray(new MenuItem[0]);
    }

    @Override
    public boolean remove(String itemName) {
        if(head.getValue().getName().equals(itemName)){
            if(head.next != null)
                head = head.next;
            else
                head = null;
            size--;
            return true;
        }
        else if(tail.getValue().getName().equals(itemName)) {
            ListNode temp = head;
            while (!temp.next.getValue().getName().equals(itemName))
                temp = temp.next;
            tail = temp;
            size--;
            return true;
        }
        else {
            ListNode temp = head;

            while(!temp.next.getValue().getName().equals(itemName) || temp != null){
                temp = temp.next;
            }

            if(temp == null){
                return false;
            } else {
                temp.next = temp.next.next;
                size--;
                return true;
            }
        }
    }

    @Override
    public boolean remove(MenuItem item) {
        if(head.getValue().equals(item)){
            if(head.next != null)
                head = head.next;
            else
                head = null;
            size--;
            return true;
        }
        else if(tail.getValue().equals(item)) {
            ListNode temp = head;
            while (!temp.next.getValue().equals(item))
                temp = temp.next;
            tail = temp;
            size--;
            return true;
        }
        else {
            ListNode temp = head;

            while(!temp.next.getValue().equals(item) || temp != null){
                temp = temp.next;
            }

            if(temp == null){
                return false;
            } else {
                size--;
                temp.next = temp.next.next;
                return true;
            }
        }
    }

    @Override
    public boolean removeAll(String itemName) {
        ListNode temp = head;

        boolean flag = false;

        while (temp != null){
            if(temp.getValue().getName().equals(itemName)){
                flag = true;
                remove(itemName);
            }
        }

        return flag;
    }

    @Override
    public boolean removeAll(MenuItem item) {
        ListNode temp = head;

        boolean flag = false;

        while (temp != null){
            if(temp.getValue().equals(item)){
                flag = true;
                remove(item);
            }
        }

        return flag;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] items = getItems();
        Arrays.sort(items, Comparator.comparing(MenuItem::getCost).thenComparing(MenuItem::getName));
        return items;
    }

    @Override
    public int costTotal() {
        ListNode temp = head;

        int total = 0;

        while (temp != null) {
            total += temp.value.getCost();
        }

        return total;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
