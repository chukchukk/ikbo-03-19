package ru.mirea.prac10.chairs;

public class SomeTest {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();
        factory.createFunctionalChair().sit();
        factory.createVictorianChair().sit();
        factory.createMagicChair().sit();

        System.out.println("------------Client test-------------------");
        Client client = new Client();
        client.setChair(factory.createFunctionalChair());
        client.sit();
    }
}
