package ru.mirea.prac16;

import ru.mirea.prac16.Item;

public interface Order {
    public boolean addItem(Item item);
    public boolean deleteByTitle(String title);
    public int deleteAllByTitle(String title);
    public int getNumOfOrders();
    public Item[] getArrOfItems();
    public double getFullCost();
    public int getNumOfItemsByTitle(String title);
    public String[] getTitles();
    public void getSortedArrOfItems();
}
