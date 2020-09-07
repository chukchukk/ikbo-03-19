package ru.mirea.lab2.human;

public class Hand {
    private Double brushCircle;  //Окружность кисти
    private Double length;  //Длина

    public Hand(Double brushCircle, Double length) {
        this.brushCircle = brushCircle;
        this.length = length;
    }

    public Double getBrushCircle() {
        return brushCircle;
    }

    public void setBrushCircle(Double brushCircle) {
        this.brushCircle = brushCircle;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "окружность кисти = " + brushCircle +
                ", длина = " + length;
    }
}
