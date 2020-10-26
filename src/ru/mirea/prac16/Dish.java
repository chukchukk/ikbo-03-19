package ru.mirea.prac16;

public final class Dish implements Item {
    public final double cost;
    public final String title, description;

    public Dish(double cost, String title, String description) {
        if (title.equals("") || description.equals("")|| cost == 0)
            throw new IllegalArgumentException();

        this.cost = cost;
        this.title = title;
        this.description = description;
    }

    public Dish(String title, String description) {
        this.title = title;
        this.description = description;
        cost = 0;
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
        return "Блюдо: " +
                "стоимость = " + cost +
                ", название = '" + title + '\'' +
                ", описание = '" + description + '\'';
    }
}
