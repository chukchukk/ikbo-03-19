package ru.mirea.lab2.human;

public class Head {
    private String hairColor;  //Цвет волос
    private double volume;  //Объем черепной коробки
    private String eyesColor;  //Цвет глаз

    public String getHairColor() {
        return hairColor;
    }

    public Head(String hairColor, double volume, String eyesColor) {
        this.hairColor = hairColor;
        this.volume = volume;
        this.eyesColor = eyesColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    @Override
    public String toString() {
        return "цвет волос = " + hairColor +
                ", объем = " + volume +
                ", цвет глаз = " + eyesColor;
    }
}
