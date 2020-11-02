package ru.mirea.lab16;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableOrdersManager implements OrdersManager {
    private Order[] orders;

    public TableOrdersManager(int size) {
        this.orders = new Order[size];
    }

    public void add(Order order, int tableNumber){
        if(tableNumber >= orders.length)
            return;
        else
            orders[tableNumber] = order;
    }

    public void addItem(MenuItem item, int tableNumber){
        if(tableNumber >= orders.length)
            return;
        else {
            orders[tableNumber].add(item);
        }
    }

    public int freeTableNumber(){
        for(int i = 0; i < orders.length; i++){
            if(orders[i] == null)
                return i;
        }

        return -1;
    }

    public int[] freeTableNumbers(){
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < orders.length; i++){
            if (orders[i] == null){
                list.add(i);
            }
        }

        return Arrays.stream(list.toArray()).mapToInt(i-> (int) i).toArray();
    }

    public Order getOrder(int tableNumber){
        if(tableNumber >= orders.length)
            return null;
        else
            return orders[tableNumber];
    }

    public void remove(int tableNumber){
        if(tableNumber >= orders.length)
            return;
        else
            orders[tableNumber] = null;
    }

    public boolean remove(Order order){
        List<Order> list = new ArrayList<>(Arrays.asList(orders));
        boolean result =  list.remove(order);

        orders = list.toArray(new Order[0]);

        return result;
    }

    public int removeAll(Order order){
        List<Order> list = new ArrayList<>(Arrays.asList(orders));

        int count = 0;
        for (Order o: list){
            if (o == order){
                list.remove(order);
                count++;
            }
        }

        return count;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;

        for(Order order: orders){
            for(MenuItem item: order.getItems()){
                if(item.getName().equals(itemName))
                    count++;
            }
        }

        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;

        for(Order order: orders){
            for(MenuItem i: order.getItems()){
                if(i.equals(item))
                    count++;
            }
        }

        return count;
    }

    @Override
    public Order[] getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        for(Order order: orders){
            cost += order.costTotal();
        }

        return cost;
    }

    @Override
    public int OrdersQuantity() {
        int count = 0;

        for(Order currentOrder: orders){
            if(currentOrder != null)
                count++;
        }

        return count;
    }
}
