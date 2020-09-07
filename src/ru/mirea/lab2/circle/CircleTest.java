package ru.mirea.lab2.circle;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Circle circle1 = new Circle(10,"red");
        System.out.println("Метод toString(): " + circle1);
        System.out.println("Длина окружности circle1: " + circle1.getLength());
        System.out.println("Диаметр circle1: " + circle1.getDiameter());
        System.out.println("Цвет circle1: " + circle1.getColor());

        System.out.println("--------------------------------");
        Circle circle2 = new Circle(); //Используем пустой перегруженный конструктор
        System.out.println("Задайте значение радиуса для circle2: ");
        circle2.setRadius(in.nextDouble());
        System.out.println("Задайте значение цвета для circle2: ");
        circle2.setColor(in.next());

        System.out.println("Метод toString(): " + circle2);
        System.out.println("Длина окружности circle1: " + circle2.getLength());
        System.out.println("Диаметр circle1: " + circle2.getDiameter());
    }
}
