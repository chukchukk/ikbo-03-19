package ru.mirea.lab16;


public class InternetOrdersManager implements OrdersManager {
    private QueueNode head;
    private QueueNode tail;
    private int size;

    public InternetOrdersManager(){
        size = 0;
        head = tail = null;
    }

    public boolean add(Order order){
        if(head == null){
            head = new QueueNode(null, order, null);
            size++;
            return true;
        }
        else{
            QueueNode temp = head;

            while(temp.next != null){
                temp = temp.next;
            }

            if(temp == null)
                return false;
            else{
                size++;
                temp.next = new QueueNode(temp, order, null);
                tail = temp.next;
                return true;
            }
        }
    }

    public Order remove(){
        Order tempOrder = head.value;
        head = head.next;
        size--;
        return tempOrder;
    }

    public Order order(){
        return head.value;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        QueueNode temp = head;

        while (temp != null){
            for(MenuItem item: temp.value.getItems()){
                if(item.getName().equals(itemName))
                    count++;
            }
        }

        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        QueueNode temp = head;

        while (temp != null){
            for(MenuItem i: temp.value.getItems()){
                if(i.equals(item))
                    count++;
            }
        }

        return count;
    }

    @Override
    public Order[] getOrders() {
        Order[] arr = new Order[size];
        QueueNode temp = head;
        int currentSize = -1;

        while (temp != null){
            arr[++currentSize] = temp.value;
        }

        return arr;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        QueueNode temp = head;

        while (temp != null){
            cost = temp.value.costTotal();
        }

        return cost;
    }

    @Override
    public int OrdersQuantity() {
        int count = 0;
        QueueNode temp = head;

        while (temp != null){
            if (temp.value != null)
                count++;
        }

        return count;
    }
}
