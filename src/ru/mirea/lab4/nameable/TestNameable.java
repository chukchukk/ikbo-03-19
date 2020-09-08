package ru.mirea.lab4.nameable;

public class TestNameable {
    public static void main(String[] args) {
        System.out.println("Тест классов, наследующих интерфейс Nameable");
        Planet planet = new Planet("Земля", 25_000);
        Car car = new Car("VW",500_000);
        Animal animal = new Animal("Beer", 10);
        System.out.println("Метод getName() класса Planet: " + planet.getName());
        System.out.println("Метод getName() класса Animal: " + animal.getName());
        System.out.println("Метод getName() класса Car: " + car.getName());
    }
}
