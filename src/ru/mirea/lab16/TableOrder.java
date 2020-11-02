package ru.mirea.lab16;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TableOrder implements Order{
    private int size = -1;
    private MenuItem[] items;
    private Customer customer;

    public TableOrder(Customer customer, int size) {
        this.customer = customer;
        items = new MenuItem[size];
    }

    @Override
    public boolean add(MenuItem item) {
        if(size + 1 > items.length){
            return false;
        } else {
            items[++size] = item;
            return true;
        }
    }

    @Override
    public String[] itemsNames() {
        List<String> temp = new ArrayList<>();
        for(MenuItem item: items){
            temp.add(item.getName());
        }
        return temp.toArray(new String[0]);
    }

    @Override
    public int itemsQuantity() {
        return size + 1;
    }

    @Override
    public int itemsQuantity(String itemName) {
        return (int) Arrays.stream(items).filter(item -> item.getName().equals(itemName)).count();
    }

    @Override
    public int itemsQuantity(MenuItem itemName) {
        return (int) Arrays.stream(items).filter(item -> item.equals(itemName)).count();
    }

    @Override
    public MenuItem[] getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        List<MenuItem> temp = new ArrayList<>();
        temp.addAll(Arrays.asList(items));

        boolean flag = false;
        for(MenuItem item: temp){
            if(item.getName().equals(itemName)){
                flag = true;
                MenuItem tempItem = item;
                temp.remove(tempItem);
                size--;
                break;
            }
        }

        items = temp.toArray(new MenuItem[0]);
        return flag;
    }

    @Override
    public boolean remove(MenuItem item) {
        List<MenuItem> temp = new ArrayList<>();
        temp.addAll(Arrays.asList(items));

        boolean result = temp.remove(item);

        if(result)
            size--;

        items = temp.toArray(new MenuItem[0]);
        return result;
    }

    @Override
    public boolean removeAll(String itemName) {
        List<MenuItem> temp = new ArrayList<>();
        temp.addAll(Arrays.asList(items));

        boolean flag = false;

        for(MenuItem item: items){
            if(item.getName().equals(itemName)){
                flag = true;
                size--;
                MenuItem tempItem = item;
                temp.remove(item);
            }
        }

        items = temp.toArray(new MenuItem[0]);
        return flag;
    }

    @Override
    public boolean removeAll(MenuItem item) {
        List<MenuItem> temp = new ArrayList<>();
        temp.addAll(Arrays.asList(items));

        boolean flag = false;

        for(MenuItem i: items){
            if(i.equals(item)){
                flag = true;
                size--;
                temp.remove(i);
            }
        }

        items = temp.toArray(new MenuItem[0]);
        return flag;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] temp = items;
        Arrays.sort(temp, Comparator.comparing(MenuItem::getCost).thenComparing(MenuItem::getName));
        return temp;
    }

    @Override
    public int costTotal() {
        return Arrays.stream(items).mapToInt(MenuItem::getCost).sum();
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
