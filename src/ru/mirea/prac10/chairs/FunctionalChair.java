package ru.mirea.prac10.chairs;

public class FunctionalChair implements Chair {
    public int sum(int a, int b){
        return a + b;
    }

    @Override
    public void sit() {
        System.out.println("Как же удобно сидеть в FunctionalChair, ммм...");
    }
}
