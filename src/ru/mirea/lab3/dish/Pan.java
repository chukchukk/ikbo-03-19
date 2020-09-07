package ru.mirea.lab3.dish;

public class Pan extends Dish {
    private double diameter;
    private String coating;  //Покрытие

    public Pan(String material, double cost, double diameter, String coating) {
        super(material, cost);
        this.diameter = diameter;
        this.coating = coating;
    }

    @Override
    public void apply() {
        System.out.println("Вы использовали сковороду.\n");
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getCoating() {
        return coating;
    }

    public void setCoating(String coating) {
        this.coating = coating;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "диаметр = " + diameter +
                ", материал = "+getMaterial() +
                ", стоимость = " + getCost() +
                ", покрытие = "+getCoating()+'}';
    }
}
