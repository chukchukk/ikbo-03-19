package ru.mirea.prac16;

import java.util.Comparator;

public final class Drink implements Item {
    public final double cost;
    public final String title, description;

    public Drink(String title, String description) {
        this.title = title;
        this.description = description;
        cost = 0;
    }

    public Drink(double cost, String title, String description) {
        if (title.equals("") || description.equals("")|| cost == 0)
            throw new IllegalArgumentException();

        this.cost = cost;
        this.title = title;
        this.description = description;
    }


    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Напиток: " +
                "стоимость = " + cost +
                ", название = '" + title + '\'' +
                ", описание = '" + description + '\'';
    }

}
