package ru.mirea.lab3.dish;

public class Plate extends Dish {
    private String type;
    private double diameter;

    public Plate(String material, double cost, String type, double diameter) {
        super(material, cost);
        this.type = type;
        this.diameter = diameter;
    }

    @Override
    public void apply() {
        System.out.println("Вы использовали тарелку.\n");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Plate {" +
                "тип = " + type  +
                ", диаметр = " + diameter +
                ", материал = "+getMaterial() +
                ", стоимость = " + getCost() +
                '}';
    }
}
