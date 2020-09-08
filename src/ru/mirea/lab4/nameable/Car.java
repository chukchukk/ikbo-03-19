package ru.mirea.lab4.nameable;

public class Car implements Nameable {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name = '" + name + '\'' +
                ", price = " + price +
                '}';
    }
}
