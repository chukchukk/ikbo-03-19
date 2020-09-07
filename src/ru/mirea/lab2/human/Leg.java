package ru.mirea.lab2.human;

public class Leg {
    private Double length; //Длина
    private Double hipsWidth; //Ширина бедер
    private Double footSize; //Размер стопы

    public Leg(Double length, Double hipsWidth, Double footSize) {
        this.length = length;
        this.hipsWidth = hipsWidth;
        this.footSize = footSize;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getHipsWidth() {
        return hipsWidth;
    }

    public void setHipsWidth(Double hipsWidth) {
        this.hipsWidth = hipsWidth;
    }

    public Double getFootSize() {
        return footSize;
    }

    public void setFootSize(Double footSize) {
        this.footSize = footSize;
    }

    @Override
    public String toString() {
        return
                "длина = " + length +
                ", ширина бедер = " + hipsWidth +
                ", размер стопы = " + footSize;
    }
}
