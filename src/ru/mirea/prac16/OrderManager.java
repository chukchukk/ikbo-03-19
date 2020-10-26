package ru.mirea.prac16;


import java.util.HashMap;
import java.util.Map;


public class OrderManager {
    private HashMap<Integer, RestaurantOrder> restaurantOrders;
    private HashMap<String, InternetOrder> internetOrders;

    public OrderManager() {
        restaurantOrders = new HashMap<>();
        internetOrders = new HashMap<>();
    }

    public boolean addOrder(Integer tableNum, RestaurantOrder order) throws Exception {
        if(restaurantOrders.containsKey(tableNum)){
            throw new Exception("OrderAlreadyAddedException");
        } else {
            restaurantOrders.put(tableNum, order);
            return true;
        }
    }

    public boolean addOrder(String address, InternetOrder order) throws Exception {
        if(internetOrders.containsKey(address)){
            throw new Exception("OrderAlreadyAddedException");
        } else {
            internetOrders.put(address, order);
            return true;
        }
    }

    public Order gerOrder(int tableNum){
        if(restaurantOrders.containsKey(tableNum)){
            return restaurantOrders.get(tableNum);
        } else {
            return null;
        }
    }

    public Order getOrder(String address){
        if(internetOrders.containsKey(address)){
            return internetOrders.get(address);
        } else {
            return null;
        }
    }

    public boolean removeOrder(int tableNum){
        if(restaurantOrders.containsKey(tableNum)){
            restaurantOrders.remove(tableNum);
            return true;
        }
        return false;
    }

    public boolean removeOrder(String address){
        if(internetOrders.containsKey(address)){
            internetOrders.remove(address);
            return true;
        }
        return false;
    }

    public void addItem(int tableNum, Item item){
        restaurantOrders.get(tableNum).addItem(item);
    }

    public void addItem(String address, Item item){
        internetOrders.get(address).addItem(item);
    }

    public InternetOrder[] getArrOfInternetOrders(){
        InternetOrder[] current = new InternetOrder[internetOrders.size()];
        int k =0;
        for(Map.Entry<String, InternetOrder> pair: internetOrders.entrySet()){
            current[k] = pair.getValue();
            k++;
        }
        return current;
    }

    public RestaurantOrder[] getArrOfRestaurantOrders(){
        RestaurantOrder[] current = new RestaurantOrder[restaurantOrders.size()];
        int k =0;
        for(Map.Entry<Integer, RestaurantOrder> pair: restaurantOrders.entrySet()){
            current[k] = pair.getValue();
            k++;
        }
        return current;
    }

    public double getFullCostByInternetOrders(){
        double fullCost = 0;
        for(Order order: internetOrders.values()){
            fullCost += order.getFullCost();
        }

        return fullCost;
    }

    public double getFullCostByRestaurantOrders(){
        double fullCost = 0;
        for(Order order: restaurantOrders.values()){
            fullCost += order.getFullCost();
        }

        return fullCost;
    }

    public int getNumberOfItemsByTitleInternet(String title){
        int number = 0;

        for(Order order: internetOrders.values()){
            number += order.getNumOfItemsByTitle(title);
        }

        return number;
    }

    public int getNumberOfItemsByTitleRestaurant(String title){
        int number = 0;

        for(Order order: restaurantOrders.values()){
            number += order.getNumOfItemsByTitle(title);
        }

        return number;
    }
}
