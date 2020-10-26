package ru.mirea.prac16;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) throws Exception {
        Item dish = new Dish(550, "Выпечка", "Шоколадный торт");
        Item drink = new Drink(100, "Чай", "Зеленый чай");
        Item drink1 = new Drink(150, "Напиток", "Coca-cola");

        Order internetOrder = new InternetOrder();
        internetOrder.addItem(dish);
        internetOrder.addItem(drink);
        internetOrder.addItem(drink1);

        System.out.println(Arrays.toString(internetOrder.getArrOfItems()));
        //Отсортированный
        System.out.println("Отсортированный");
        internetOrder.getSortedArrOfItems();

        internetOrder.deleteByTitle("Чай");
        System.out.println(Arrays.toString(internetOrder.getArrOfItems()));

        RestaurantOrder order1 = new RestaurantOrder();
        order1.addItem(drink1);

        OrderManager orderManager = new OrderManager();
        orderManager.addOrder("Moscow", (InternetOrder) internetOrder);
        orderManager.addOrder(23, order1);

        InternetOrder[] internetOrders = orderManager.getArrOfInternetOrders();
        for(int i = 0; i < internetOrders.length; i++){
            System.out.println(Arrays.toString(internetOrders[i].getTitles()));
            System.out.println(internetOrders[i].getFullCost());
        }
    }
}
