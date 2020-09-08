package ru.mirea.lab4.nameable;

public class Planet implements Nameable {
    private String name;
    private double radius;

    public Planet(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Planet {" +
                "name = '" + name + '\'' +
                ", radius = " + radius +
                '}';
    }
}
