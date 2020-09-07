package ru.mirea.lab3.dish;

public class Glass extends Dish {
    private double volume;
    private String type;

    public Glass(String material, double cost, double volume, String type) {
        super(material, cost);
        this.volume = volume;
        this.type = type;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void apply() {
        System.out.println("Вы использовали бокал.\n");
    }



    @Override
    public String toString() {
        return "Glass{" +
                "объем = " + volume +
                ", материал = "+getMaterial() +
                ", стоимость = " + getCost() +
                '}';
    }
}
