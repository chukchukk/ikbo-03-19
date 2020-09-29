package ru.mirea.prac10.chairs;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicChair createMagicChair();
    public FunctionalChair createFunctionalChair();
}
