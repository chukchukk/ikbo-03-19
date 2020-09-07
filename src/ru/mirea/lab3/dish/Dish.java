package ru.mirea.lab3.dish;

public abstract class Dish {
    private String material;  //Материал
    private double cost;  //Стоимость

    public Dish(String material, double cost) {
        this.material = material;
        this.cost = cost;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public abstract void apply();


}
