package ru.mirea.prac10.chairs;

public class MagicChair implements Chair {
    public void doMagic(){
        System.out.println("Ma-a-a-a-a-gic...");
    }

    @Override
    public void sit() {
        System.out.println("Как же удобно сидеть в MagicChair, ммм...");
    }
}
