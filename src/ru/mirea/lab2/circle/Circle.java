package ru.mirea.lab2.circle;

public class Circle {
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        if(radius < 0) {
            System.out.println("Введено некорректное значение.");
            return;
        }
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(){}

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public double getLength(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
