package ru.mirea.prac16;

import java.util.*;

public class RestaurantOrder implements Order {
   private OrderList list;

    public RestaurantOrder() {
        list = new OrderList();
    }

    public RestaurantOrder(Collection<Item> collection){
        list = new OrderList(collection);
    }

    @Override
    public boolean addItem(Item item){
        return list.addEnd(item);
    }

    @Override
    public boolean deleteByTitle(String title){
        Item current = null;

        for(Item item:list.toArray()){
            if(item.getTitle().equals(title)){
                current = item;
            }
        }

        return list.remove(current);
    }

    @Override
    public int deleteAllByTitle(String title){
        int k = 0;
        for(Item item: list.toArray()){
            if(item.getTitle().equals(title)){
                k++;
                list.remove(item);
            }
        }

        return k;
    }

    @Override
    public int getNumOfOrders(){
        return list.size();
    }

    @Override
    public Item[] getArrOfItems(){
        return list.toArray();
    }

    @Override
    public double getFullCost(){
        double fullCost = 0;

        for(Item item: list.toArray()){
            fullCost += item.getCost();
        }

        return fullCost;
    }

    @Override
    public int getNumOfItemsByTitle(String title){
        int k = 0;

        for(Item item: list.toArray()){
            if(item.getTitle().equals(title)){
                k++;
            }
        }

        return k;
    }

    @Override
    public String[] getTitles(){
        Set<String> set = new HashSet<>();
        String [] current;

        for(Item item: list.toArray()){
            set.add(item.getTitle());
        }

        current = new String[set.size()];
        int k = 0;
        for(String s: set){
            current[k] = s;
            k++;
        }
        return current;
    }

    @Override
    public void getSortedArrOfItems(){
        Arrays.stream(list.toArray()).sorted((i1, i2) -> (int) (i2.getCost() - i1.getCost())).forEach(System.out::println);
    }
}
